package com.github.nicaiseeric.axagd

import org.scalatest.FunSuite


import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountCombiSuite extends FunSuite {
  import AxaDataScientistMain._

  test("countCombi: value 0") {
    assert(combiFun(0) === 0)
  }

  test("countCombi: value 1") {
    assert(combiFun(1) === 1)
  }

  test("countCombi: value 5") {
    assert(combiFun(5) === 8)
  }
}

