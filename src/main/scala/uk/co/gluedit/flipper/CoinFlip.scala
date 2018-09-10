package uk.co.gluedit.flipper

import scala.annotation.tailrec
import scala.util.Random

case class GameState(numFlips: Int, numCorrectGuesses: Int)

object CoinFlip extends App {

  import CoinFlipUtils._

  val s = GameState(0, 0)
  val r = new Random()

  @tailrec
  def mainLoop(gameState: GameState, random: Random): Unit = {
    showPrompt
    val guess = getUserInput
    guess match {
      case "H" | "T" => {
        val flip = tossCoin(random)
        val newGameState = if (guess == flip) {
          GameState(gameState.numFlips + 1, gameState.numCorrectGuesses + 1)
        } else {
          GameState(gameState.numFlips + 1, gameState.numCorrectGuesses)
        }
        printGameState(printableFlipResult(flip), newGameState)
        mainLoop(newGameState, random)
      }
      case _ => printGameOver
    }
  }

  mainLoop(s, r)

}