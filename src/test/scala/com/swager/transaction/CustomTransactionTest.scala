package com.swager.transaction

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by josephswager on 9/29/15.
 */
class CustomTransactionTest extends FlatSpec with Matchers {
  "Run CustomTransaction execute" should
    "print its custom message in its excute method and perform rest of general Transaction" in {
    val customTransaction = new CustomTransaction()
    customTransaction.executeTransaction()
  }

  "Run SecretTransaction execute" should
    "print its custom message in its excute method and perform rest of general Transaction" in {
    val secretTransaction = new SecretTransaction()
    secretTransaction.executeTransaction()
  }
}
