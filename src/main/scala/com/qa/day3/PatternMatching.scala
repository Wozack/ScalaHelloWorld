package com.qa

object PatternMatching {

  def main(args: Array[String]): Unit = {
    matcher("fizz", "bhuzz", 15)
  }

  def matcher(str1:String, str2: String, i: Int): Unit = (1 until i+1).map(i => (i % 3, i % 5) match {
  case (0, 0) => str1 + str2
  case (0, _) => str1
  case (_, 0) => str2
  case _ => i
  }).foreach(println)


}









