package com.swager

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by josephswager on 9/28/15.
 */
class PasswordStrengthIndicatorSpecification extends FlatSpec with Matchers {

  "When passwordValidator is given a password of 6 characters" should "indicate it as a very weak password" in {
    val passwordStrength = PasswordStrengthIndicator.passwordValidator("pass12")
    passwordStrength should be("Very Weak password")
  }

  "When passwordValidator is given a password of 8 characters but all the same type" should
    "indicate it as a weak password" in {
    val passwordStrength = PasswordStrengthIndicator.passwordValidator("password")
    passwordStrength should be("Weak password")
  }

  "When passwordValidator is given a password of 8 characters and is of digits and lowercase" should
    "indicate it as a strong password" in {
    val passwordStrength = PasswordStrengthIndicator.passwordValidator("thisgr8t")
    passwordStrength should be("Strong Password")
  }

  "When passwordValidator is given a password of 8 characters and is of digits, uppercase and lowercase" should
    "indicate it as a strong password" in {
    val passwordStrength = PasswordStrengthIndicator.passwordValidator("Thisgr8T")
    passwordStrength should be("Strong Password")
  }

  "When passwordValidator is given a password of 8 characters and is of digits, uppercase, lowercase and specail " should
    "indicate it as a strong password" in {
    val passwordStrength = PasswordStrengthIndicator.passwordValidator("Th!sgr8T")
    passwordStrength should be("Very Strong password")
  }
}
