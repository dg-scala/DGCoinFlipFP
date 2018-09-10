package uk.co.gluedit.flipper

import scala.io.StdIn.readLine
import scala.util.Random

object CoinFlipUtils {

  def showPrompt: Unit = { print("\n(h)eads, (t)ails, (q)uit: ") }

  def getUserInput: String = readLine.trim.toUpperCase

  def printableFlipResult(flip: String): String = flip match {
    case "H" => "Heads"
    case "T" => "Tails"
  }

  def printGameState(printableResult: String, gameState: GameState): Unit = {
    print(s"Flip was $printableResult. ")
    printGameState(gameState)
  }

  def printGameState(gameState: GameState): Unit = {
    println(s"#Flips: ${gameState.numFlips}, #Correct: ${gameState.numCorrectGuesses}")
  }

  def printGameOver: Unit = println("\n=== GAME OVER ===")

  // returns "H" for heads and "T" for tails
  def tossCoin(r: Random): String = {
    val i = r.nextInt(2)
    i match {
      case 0 => "H"
      case 1 => "T"
    }
  }

}
