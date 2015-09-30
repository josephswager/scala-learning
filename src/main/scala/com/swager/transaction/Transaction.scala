package com.swager.transaction

/**
 * Goal of this class is to demo how the Command Pattern is replaced with Higher Order functions
 * Created by josephswager on 9/29/15.
 */
object Transaction {

  def preformTransaction(command: () => Unit) = {
    setupDataInfastructure()
    try {
      command()
      completeTransaction()
    }
    catch {
      case e: Exception => rollbackTransaction()
      // possible throw an very informative exception here
    }
    finally {
      cleanup()
    }
  }

  def setupDataInfastructure(): Unit = {
    //setup any jdbc type connectivity
    println("Setup connectivity for transaction.")
  }

  def completeTransaction(): Unit = {
    // code to preform transaction
    println("Preforming transaction.")
  }

  def rollbackTransaction(): Unit = {
    // rollback transaction code
    println("Rolling back transaction and doing data cleanup.")
  }

  def cleanup(): Unit = {
    //release any resources that should be released at this time
    println("Preforming transaction cleanup.")
  }
}
