package com.qa

object PatternMatching {

  def main(args: Array[String]): Unit = {

  }

  def fizzBuzz(str1:String, str2: String, int:Int): Unit = {

    for(i<-1 to int by 1){
      matcher(i)
    }
  }

  def matcher(i: Int): Unit = i match {

  (1 until i).map(i => (i % 3, i % 5) match {
  case (0, 0) => "FizzBuzz"
  case (0, _) => "Fizz"
  case (_, 0) => "Buzz"
  case _ => i
  }).foreach(println)


  }



}





