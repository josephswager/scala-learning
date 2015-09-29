package com.swager

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by josephswager on 9/28/15.
 */
class AuthenticationTokenGeneratorSpecification extends FlatSpec with Matchers{
  "When generate is called with a length of 8" should " return a string of length 8 characters" in{
    val tokenGenerated = new AuthenticationTokenGenerator().generate(8)
    println(tokenGenerated)
    tokenGenerated.size should be(8)
  }
}
