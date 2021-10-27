package edu.knoldus

class Succ(x: Nat) extends Nat with Sign {
  def isZero: Boolean = false
  def predecessor: Nat = x
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat = x + that.successor
  def -(that: Nat): Nat = if (that.isZero) this else x - that.predecessor
  def isPositive: Boolean = true
  def negate: Int = -x.successor.toInt
  override def toInt = {
    def getNumber(n: Nat): Int =
      n match {
        case a: Nat if a.isZero => 0
        case _                  => 1 + getNumber(n.predecessor)
      }
    val number = getNumber(this)
    number
  }

}
