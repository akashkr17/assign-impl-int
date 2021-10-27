package edu.knoldus

object Main extends App {

  val zero = Zero
  println(zero.predecessor)
  val one = new Succ(Zero)
  println(one)
  val two = new Succ(one)
  println(two)
  val three = new Succ(two)
  println(three + one + two)
  println(three - one)
  println(" negate :" + three.negate)

  println(zero.predecessor)
  val minusone = new Pred(Zero)
  println(minusone)
  val minusTwo = new Pred(minusone)
  println(minusTwo)
  val minusThree = new Pred(minusTwo)
  println(minusThree.negate)
  println(minusTwo.isZero)
}
