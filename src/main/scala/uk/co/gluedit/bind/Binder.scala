package uk.co.gluedit.bind

object Binder {

  def f(a: Int): (Int, String) = ???
  def g(a: Int): (Int, String) = ???
  def h(a: Int): (Int, String) = ???

  def bind(f: Int => (Int, String), res: (Int, String)): (Int, String) = {
    val fRes = f(res._1)
    (fRes._1, res + fRes._2)
  }

}
