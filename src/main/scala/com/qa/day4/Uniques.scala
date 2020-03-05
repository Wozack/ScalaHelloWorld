package com.qa

import scala.collection.mutable

//Given 3 integer values, return their sum. If one value is the same as another value, they do
//not count towards the sum. Aka only return the sum of unique numbers given.
//Input(1,2,3) -> 6
//Input (3,3,3) -> 0
//Input (1,1,2) -> 2

package object Uniques {

  def main(args: Array[String]): Unit = {
  setMaker(1,2,2)
    uniques(set1)

  }

def setMaker(int1:Int, int2:Int, int3:Int): Unit = {
  var set1 = Set(int1, int2, int3)
}


  def uniques(input: Any): Unit = input match{

    case mutable.Set(_) => println(0)
    case mutable.Set(_, _, _) => println(Set(1) + Set(2) + Set(3))
    case mutable.Set(_, _) =>println(Set(1) + Set(2))
  }
}
