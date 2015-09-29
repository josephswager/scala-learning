package com.swager

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by josephswager on 9/28/15.
 */
class NumberClassifierSpecification extends FlatSpec with Matchers {

  "Using NumberClassifier factors the number 12" should "contain the sequence values of 1,2,3,4,6, and 12" in {
    val sequence = NumberClassifier.factors(12)
    sequence should have length (6)
    sequence should be(Seq(1, 2, 3, 4, 6, 12))
  }

  "Using NumberClassifier isFactor the number 4" should "be a factor of 12 " in {
    val resultOfIsFactor = NumberClassifier.isFactor(12, 4)
    resultOfIsFactor should be(true)
  }

  "Using NumberClassifier isFactor the number 5" should "not be a factor of 12 " in {
    val resultOfIsFactor = NumberClassifier.isFactor(12, 5)
    resultOfIsFactor should be(false)
  }

  "Using NumberClassifier sum the number 6 factors" should "total 12" in {
    val sumOfFactors = NumberClassifier.sum(Seq(1,2,3,6))
    sumOfFactors should be(12)
  }

  "Using NumberClassifier sum the number 12 factors" should "total 28" in {
    val sumOfFactors = NumberClassifier.sum(Seq(1,2,3,4,6,12))
    sumOfFactors should be(28)
  }

  "Using NumberClassifier isPerfect the number 496" should "be a perfect number" in {
    val resultOfIsPerfect = NumberClassifier.isPerfect(496)
    resultOfIsPerfect should be(true)
  }

  "Using NumberClassifier isPerfect the number 497" should "not be a perfect number" in {
    val resultOfIsDeficient = NumberClassifier.isPerfect(497)
    resultOfIsDeficient should be(false)
  }

  "Using NumberClassifier isDeficient the number 497" should "be a deficient number" in {
    val resultOfIsPerfect = NumberClassifier.isDeficient(497)
    resultOfIsPerfect should be(true)
  }


  "Using NumberClassifier isDeficient the number 498" should "not be a deficient number" in {
    val resultOfIsDeficient = NumberClassifier.isDeficient(498)
    resultOfIsDeficient should be(false)
  }

  "Using NumberClassifier isAbundant the number 498" should "be an abundant number" in {
    val resultOfIsAbundant = NumberClassifier.isAbundant(498)
    resultOfIsAbundant should be(true)
  }

  "Using NumberClassifier isAbundant the number 496" should "not be an abundant number" in {
    val resultOfIsAbundant = NumberClassifier.isAbundant(496)
    resultOfIsAbundant should be(false)
  }

  "Using NumberClassifier isAbundant the number 497" should "not be an abundant number" in {
    val resultOfIsAbundant = NumberClassifier.isAbundant(497)
    resultOfIsAbundant should be(false)
  }
}
