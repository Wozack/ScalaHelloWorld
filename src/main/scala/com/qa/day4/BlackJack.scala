package com.qa

//Given 2 integer values greater than 0, return whichever value is closest to 21 without going
//over 21. If they both go over 21 then return 0
//Input(18,21) -> 21
//Input(20,18) -> 20
//Input(22,22) -> 0

object BlackJack {

  def main(args: Array[String]): Unit = {

    println(blackJack(Array(18,20)))
  }

  def blackJack(arr: Array[Int]): Int ={

    var winner = 22

    for(i <- 0 until arr.length by 1){
      if(i <= 21){
        var sum = (21-arr(i))
        if(sum < winner){
          winner = arr(i)
        }
      }
    }
    winner
  }


}
