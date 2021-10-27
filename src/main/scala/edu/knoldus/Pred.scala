package edu.knoldus
class Pred(x: Nat) extends Nat with Sign {
  def isZero: Boolean = false
  def predecessor: Nat = new Pred(this)
  def successor: Nat = x
  def +(that: Nat): Nat = x + that.predecessor
  def -(that: Nat): Nat = if (that.isZero) this else x - that.successor
  def isPositive: Boolean = false
  def negate: Int = -x.predecessor.toInt
  override def toInt = {
    def getNumber(n: Nat): Int =
      n match {
        case a: Nat if a.isZero => 0
        case _                  => getNumber(n.successor) - 1
      }

    val number = getNumber(this)
    number
  }
}
