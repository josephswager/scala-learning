package com.swager

import scala.util.Random

/**
 * Created by josephswager on 9/28/15.
 */
class AuthenticationTokenGenerator {

  def generate(length: Int): String = {

    val random = new Random
    val tokenBuilder = random.alphanumeric take (length - 1)

    tokenBuilder.mkString + CharacterSet.SPECIAL_CHARACTERS(new Random().nextInt(10))
  }

}
