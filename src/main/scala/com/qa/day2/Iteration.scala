package com.qa

object Iteration {

  def main(args: Array[String]): Unit = {
    iterator("Y", 5)
  }

  def iterator(str:String, int: Int): Unit = {

    for (i <- 0 to int-1 by 1){
      println(str*int)

    }
  }
}
