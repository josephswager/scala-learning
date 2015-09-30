package com.swager.transaction

/**
 * Created by josephswager on 9/29/15.
 */
class CustomTransaction {

  def executeTransaction() = {
    val createOrderTransaction = {
      () => {
        println("executeTransaction in CustomTransaction")
      }
    }
    Transaction.preformTransaction(createOrderTransaction)
  }

}

class SecretTransaction {
  def executeTransaction() = {
    val createOrderTransaction = {
      () => {
        println("executeTransaction in SecretTransaction")
      }
    }
    Transaction.preformTransaction(createOrderTransaction)
  }
}
