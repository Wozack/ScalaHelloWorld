package com.qa

import scala.collection.mutable.ArrayBuffer
import scala.io.Source


object Hangman {

  val arr = ArrayBuffer[String]()
  val random = new scala.util.Random
  val num = random.nextInt(101)
  val word = arr(num).toCharArray
  var hiddenWord = "_ " * word.length

  def main(args: Array[String]): Unit = {

    hangmanWord(true)
  }

  def hangmanWord(bool: Boolean): Unit ={


    val filename = "hangman100.txt"
    for (line <- Source.fromFile(filename).getLines()) {
          arr.+=(line)
        }


    println(hiddenWord)

  }

  def enterLetter(bool: Boolean): Unit ={

    println("Enter a letter for the Hangman: ")
    val ltr = scala.io.StdIn.readChar()
    if(word.contains(ltr)){
      println(s"You are correct, $ltr is in the Hangman's Word...")

    }

  }
}
