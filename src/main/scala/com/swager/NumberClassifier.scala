package com.swager

/**
 * Created by josephswager on 9/28/15.
 */
object NumberClassifier {
  def isFactor(number: Int, potentialFactor: Int) = {
    number % potentialFactor == 0
  }

  def factors(number: Int) = {
    (1 to number) filter (number % _ == 0)
  }

  def sum(factors: Seq[Int]) = {
    factors.foldLeft(0)(_ + _)
  }

  def isPerfect(number: Int) = {
    sum(factors(number)) - number == number
  }

  def isAbundant(number: Int) = {
    sum(factors(number)) - number > number
  }

  def isDeficient(number: Int) = {
    sum(factors(number)) - number < number
  }
}
