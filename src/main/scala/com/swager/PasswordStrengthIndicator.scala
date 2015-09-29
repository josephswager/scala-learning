package com.swager

/**
 * Created by josephswager on 9/28/15.
 */
object PasswordStrengthIndicator {

  def passwordValidator(password: String) = {
    if (checkPasswordLength(password)) "Very Weak password"
    else if (checkPasswordIsAllOneType(password)) "Weak password"
    else if (checkIfItHasAllTypes(password) < 4) "Strong Password"
    else "Very Strong password"
  }

  def checkPasswordLength(password: String) = {
    if (password.length < 8) {
      true
    } else {
      false
    }
  }

  def checkPasswordIsAllOneType(password: String) = {
    if (password forall Character.isDigit)
      true
    else if (password forall Character.isLowerCase)
      true
    else if (password forall Character.isUpperCase)
      true
    else
      false
  }

  def checkIfItHasAllTypes(password: String) = {
    var numberOfTypesContained = 0

    if (password matches """^.*\d.*$""") numberOfTypesContained += 1

    if (password matches """^.*[A-Z].*$""") numberOfTypesContained += 1

    if (password matches """^.*[a-z].*$""") numberOfTypesContained += 1

    if (password matches """^.*[!@#$%^*<>?].*$""") numberOfTypesContained += 1

    numberOfTypesContained
  }

}
