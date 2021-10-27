package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class PredSpec extends AnyFunSuite{
  val zero = Zero
  val minusOne = new Pred(Zero)
  val minusTwo = new Pred(minusOne)
  val minusThree = new Pred(minusTwo)

  test("Integer Minus one predecessor should be -2") {
    assert(minusOne.predecessor.toInt  == -2)
  }
  test("Integer  MinusOne successor should be 0") {
    assert(minusOne.successor.toInt  == 0)
  }
  test("Integer MinusOne should not be 0") {
    assert(!minusOne.isZero)
  }
  test("Integer MinusOne add one to get -2") {
    assert((minusOne + minusOne).toInt  == -2)
  }
  test("Integer MinusOne one subtract one to get 1") {
    assert((minusOne - minusOne).toInt  == 0)
  }
  test("Integer MinusOne is a  negative integer") {
    assert(!minusOne.isPositive)
  }
  test("Negate of Integer MinusOne should be 1") {
    assert(minusOne.negate.toInt == 1)
  }

}
