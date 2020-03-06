package com.qa

object NumWorker {

 def main(args: Array[String]): Unit = {
     println(numWorker(2, 8, 34))
  }

  def numWorker(A: Int, B: Int, C: Int): Int = {
    val list = List(A, B, C)

    val newList = list.sorted

    (newList(1) + newList(2)) * newList(0)

  }
}