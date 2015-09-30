package com.swager.coffeehouse

import com.swager.coffeehouse.model.{Charge, Coffee, CreditCard, RoastType}

/**
 * Created by josephswager on 9/29/15.
 */
class Cafe {

  def buyCoffee(creditCard: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee(RoastType.CITY, 2.99) // todo remove hard coded values when build is complete
    (cup, Charge(creditCard, cup.price))
  }

  def buyCoffees(creditCard: CreditCard, numberOfCoffees: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = List.fill(numberOfCoffees)(buyCoffee(creditCard))
    val (coffees, charges) = purchases.unzip
    (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
  }

}
