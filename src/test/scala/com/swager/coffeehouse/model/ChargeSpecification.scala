package com.swager.coffeehouse.model

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by josephswager on 9/29/15.
 */
class ChargeSpecification extends FlatSpec with Matchers {
  "When Charge calls method combine with different credit card" should " throw an Exception" in {
    // arrange
    val card1 = new CreditCard(cc_number = "1234567890123456")
    val card2 = new CreditCard(cc_number = "1234567890654321")
    val charge1 = new Charge(card1, 2.00)
    val charge2 = new Charge(card2, 2.00)
    // act
    val thrown = the[Exception] thrownBy {
      val batchCharge = charge1 combine charge2
    }
    // assert
    thrown.getMessage should be ("Can't combine charges to different Credit Cards!")
  }

  "When Charge calls method combine with same credit card" should
    "charge1's amount $2.00 and charge2's amount is 4.35 then a total in batch charge should be 6.35" in {
    // arrange
    val card = new CreditCard(cc_number = "1234567890123456")
    val charge1 = new Charge(card, 2.00)
    val charge2 = new Charge(card, 4.35)
    // act
    val batchCharge = charge1 combine charge2
    // assert
    batchCharge should have (
      'amount (6.35),
      'creditCard (card)
    )
  }
}
