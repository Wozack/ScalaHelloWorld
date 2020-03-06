package com.qa

object RPSLS {

  var moveList = List("ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK")
  var victoryCounter = 0
  var loseCounter = 0
  var pMove = ""
  var oMove = ""

  def main(args: Array[String]): Unit = {
  gameStart()

  }

  def gameStart(): Unit = {
    println("You have been challenged to ROCK, PAPER, SCISSORS, LIZARD, SPOCK!")
    while( victoryCounter <= 5 || loseCounter <= 5) {
      if(victoryCounter == 5){
        println("WELL DONE! YOU WIN!!!")
      }else if(loseCounter == 5){
        println("YOU LOST! WHAT A FAILURE!!!")
      }else{
        println(s"Your current score is $victoryCounter")
        println(s"Your opponent's score is $loseCounter")
        playerMove()
      }

    }

  }

  def playerMove(): Unit = {
    println("What will you choose? Please enter ROCK, PAPER, SCISSORS, LIZARD, SPOCK: ")
    pMove = scala.io.StdIn.readLine().toUpperCase
    opponentMove()
    pMove
  }

  def opponentMove(): Unit = {
    val random = new scala.util.Random
    oMove = moveList(random.nextInt(moveList.length - 1))
    conflict(TheConflict(pMove, oMove))

  }

  case class TheConflict(playerMove: String, opponentMove: String)

  def conflict(result: TheConflict): Unit = result match {
    case TheConflict("ROCK", "SCISSORS") => {
      println("Your rock blunts the opponent's scissors!")
      moveList + "PAPER" + "SPOCK"
      victoryCounter += 1
    }
    case TheConflict("ROCK", "LIZARD") => {
      println("Your rock crushes the opponent's lizard!")
      moveList + "PAPER" + "SPOCK"
      victoryCounter += 1
    }
    case TheConflict("PAPER", "ROCK") => {
      println("Your paper envelops the opponent's rock!")
      moveList + "SCISSORS" + "LIZARD"
      victoryCounter += 1
    }
    case TheConflict("PAPER", "SPOCK") => {
      println("Your paper disregards the opponent's spock")
      moveList + "SCISSORS" + "LIZARD"
      victoryCounter += 1
    }
    case TheConflict("SCISSORS", "LIZARD") => {
      println("Your scissors decapitate the opponent's lizard!")
      moveList + "ROCK" + "SPOCK"
      victoryCounter += 1
    }
    case TheConflict("SCISSORS", "ROCK") => {
      println("Your scissors slice through the opponent's paper!")
      moveList + "ROCK" + "SPOCK"
      victoryCounter += 1
    }
    case TheConflict("LIZARD", "PAPER") => {
      println("Your lizard digested the opponent's paper!")
      moveList + "ROCK" + "SCISSORS"
      victoryCounter += 1
    }
    case TheConflict("LIZARD", "SPOCK") => {
      println("Your lizard poisoned the opponent's spock! HE'S FUCKING DEAD!")
      moveList + "ROCK" + "SCISSORS"
      victoryCounter += 1
    }
    case TheConflict("SPOCK", "ROCK") => {
      println("Your spock vaporised the opponent's rock!")
      moveList + "PAPER" + "LIZARD"
      victoryCounter += 1
    }
    case TheConflict("SPOCK", "SCISSORS") => {
      println("Your spock disassembled the opponent's scissors!")
      moveList + "PAPER" + "LIZARD"
      victoryCounter += 1
    }
    case TheConflict("SPOCK", "LIZARD") => {
      println("Your spock got poisoned by the opponent's lizard! HE'S FUCKING DEAD")
      loseCounter += 1

    }
    case TheConflict("SPOCK", "PAPER") => {
      println("Your spock got disregarded by the opponent's paper!")
      loseCounter += 1
    }
    case TheConflict("LIZARD", "ROCK") => {
      println("Your lizard got smashed to a pulp by the opponent's rock!")
      loseCounter += 1
    }
    case TheConflict("LIZARD", "SCISSORS") => {
      println("Your lizard got decapitated by the opponent's scissors!")
      loseCounter += 1
    }
    case TheConflict("SCISSORS", "ROCK") => {
      println("Your scissors lost their edge by the opponent's rock!")
      loseCounter += 1
    }
    case TheConflict("SCISSORS", "SPOCK") => {
      println("Your scissors got disassembled by the opponent's spock!")
      loseCounter += 1
    }
    case TheConflict("PAPER", "LIZARD") => {
      println("Your paper got eaten up by the opponent's lizard!")
      loseCounter += 1
    }
    case TheConflict("PAPER", "SCISSORS") => {
      println("Your paper got cut up by the opponent's scissors!")
      loseCounter += 1
    }
    case TheConflict("ROCK", "SPOCK") => {
      println("Your rock got vaporised by the opponent's spock!")
      loseCounter += 1
    }
    case TheConflict("ROCK", "PAPER") => {
      println("Your rock got enveloped by the opponent's paper!")
      loseCounter += 1
    }
    case TheConflict(_, _) => {
      println("It's a stalemate!")
      victoryCounter += 0
    }
  }
}
