package com.qa

object BottlesOfBeer {

    def main(args: Array[String]): Unit = {
      beerCounter(100)
    }

    def beerCounter(number:Int) {
      for(num <- number until 0 by -1){
        println(s"$num bottles of beer on the wall $num bottles of beer!")
        println("Take one down, pass it around now there's "+(num-1)+" bottles of beer on the wall")
      }
    }

}
