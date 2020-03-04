package com.qa

import scala.collection.mutable.ArrayBuffer
import scala.io.Source


object Hangman {

  val arr = ArrayBuffer[String]()
  val random = new scala.util.Random
  val num = random.nextInt(101)
  var word = ""
  var hiddenWord = ""
  var deathCounter = 0


  def main(args: Array[String]): Unit = {
    hangmanWord(true)
    enterLetter(true)
  }

  def hangmanWord(bool: Boolean): Unit = {


    val filename = "hangman100.txt"
    for (line <- Source.fromFile(filename).getLines()) {
      arr.+=(line)
    }
    word = arr(num)    //.toCharArray

    hiddenWord = "_ " * word.length()
    println(hiddenWord)
    println(word)
  }

  def enterLetter(bool: Boolean): Unit ={

    println("Enter a letter for the Hangman: ")
    val ltr = scala.io.StdIn.readChar()
    hiddenWord = ""
    if(word.contains(ltr)){
      println(s"You are correct, $ltr is in the Hangman's Word...")
      for(i <- 0 to word.length-1 by 1){
        if(ltr != word(i)){
          hiddenWord += "_ "
        }else{
          hiddenWord += ltr + " "
        }
      }
    }else{
      println("THAT IS INCORRECT! DEATH DRAWS CLOSER!")
      deathCounter += 1
    }
    println(hiddenWord)
  }
}
