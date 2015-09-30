package com.swager.coffeehouse.model


/**
 * Created by josephswager on 9/29/15.
 */
case class CreditCard(cc_number: String, expiration_month: Option[Int] = None, cvv: Option[Int] = None,
                 expiration_year: Option[Int] = None, name_on_card: Option[String] = None,
                 address: Option[CreditCardAddress] = None) {

}

case class CreditCardAddress(address1: String, address2: Option[String] = None,
                             city: String, state: String, country: String, zip: String)