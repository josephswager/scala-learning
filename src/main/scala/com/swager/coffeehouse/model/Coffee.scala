package com.swager.coffeehouse.model

import com.swager.coffeehouse.model.RoastType.RoastType

/**
 * Created by josephswager on 9/29/15.
 */
case class Coffee(roastType: RoastType, price: Double) {

}

object RoastType extends Enumeration {
  type RoastType = Value
  val GREEN_BEAN, LIGHT, CITY, FULL_CITY, MEDIUM, FRENCH, DARK, ITALIAN = Value
}
