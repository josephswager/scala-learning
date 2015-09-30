package com.swager.coffeehouse.model

/**
 * Created by josephswager on 9/29/15.
 */
case class Charge(creditCard: CreditCard, amount: Double) {

  def combine(other: Charge): Charge = {
    if (creditCard == other.creditCard)
      Charge(creditCard, amount + other.amount)
    else
      throw new Exception("Can't combine charges to different Credit Cards!")
  }

  def coalesce(charges: List[Charge]): List[Charge] = charges.groupBy(_.creditCard).values.map(_.reduce(_ combine _)).toList
}
