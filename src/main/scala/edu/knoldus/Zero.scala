package edu.knoldus

object Zero extends Nat {
  def isZero: Boolean = true
  def predecessor: Nat = new Pred(this)
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat = that
  override def toInt = 0
}
