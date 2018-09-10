package uk.co.gluedit.catsio

import cats.effect.IO

object CatsIODemo extends App {

  val program = for {
    _ <- IO { println("Welcome to Scala! What's your name?") }
    name <- IO { scala.io.StdIn.readLine }
    nameUC = name.toUpperCase
    _ <- IO { println(s"Well hello, $nameUC") }
  } yield ()

  program.unsafeRunSync()

}
