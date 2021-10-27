package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class SuccSpec extends AnyFunSuite{

  val zero = Zero
  val plusOne = new Succ(Zero)
  val plusTwo = new Succ(plusOne)
  val plusThree = new Succ(plusTwo)

  test("Integer one predecessor should be 0") {
    assert(plusOne.predecessor.toInt  == 0)
  }
  test("Integer one successor should be 2") {
    assert(plusOne.successor.toInt  == 2)
  }
  test("Integer one successor should not be 0") {
    assert(!plusOne.isZero)
  }
  test("Integer one add one to get 2") {
    assert((plusOne + plusOne).toInt  == 2)
  }
  test("Integer one subtract one to get 1") {
    assert((plusOne - plusOne).toInt  == 0)
  }
  test("Integer one is a positive integer") {
    assert(plusOne.isPositive)
  }
  test("Negate of Integer Plus one should be -1") {
    assert(plusOne.negate.toInt == -1)
  }



}
