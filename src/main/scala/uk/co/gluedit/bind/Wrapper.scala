package uk.co.gluedit.bind

class Wrapper[A](value: A) {

  def map[B](f: A => B): Wrapper[B] = {
    Wrapper(f(value))
  }

  def flatMap[B](f: A => Wrapper[B]): Wrapper[B] = f(value)

}

object Wrapper {

  def apply[A](value: A): Wrapper[A] = new Wrapper(value)

}
