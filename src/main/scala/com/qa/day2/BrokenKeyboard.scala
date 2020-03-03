//package com.qa
//
//import scala.collection.mutable.ArrayBuffer
//import scala.io.Source
//
//object BrokenKeyboard {
//
//
//  def main(args: Array[String]): Unit = {
//
//    brokenKeyboard("abc")
//  }
//
//  def brokenKeyboard(str:String): Unit = {
//
//    val arr = ArrayBuffer[Char]()
//    for(i <- 0 to str.length()-1 by +1) {
//      arr += str.charAt(i)
//    }
//
//
//    val filename = "enable1.txt"
//    for (line <- Source.fromFile(filename).getLines()) {
//      var word = arr every (Char => line.includes(Char))
//        }
//     }
//   }
//
//}
