package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ZeroSpec extends AnyFunSuite {

  val zero = Zero
  val plusOne = new Succ(Zero)
  val minusOne = new Pred(Zero)

  test("Zero predecessor should be -1") {
    assert(zero.predecessor.toInt == -1)
  }
  test("Zero successor should be 1") {
    assert(zero.successor.toInt  == 1)
  }

  test("Zero should be  0") {
    assert(zero.isZero)
  }
  test("Zero add one to get  1") {
    assert(zero.+(plusOne).toInt  == 1)
  }
  test("Zero subtract one to get  -1") {
    assert(zero.-(minusOne).toInt  == -1)
  }

}
