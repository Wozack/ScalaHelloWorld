package com.qa

//Create a method that does not signify a return type and outputs whatever is given to it, then
//test it by passing it the follow different data types, Double, String, Integer, Boolean

object TypeInterface {

  def main(args: Array[String]): Unit = {
    println(tInterface(12))
    println(tInterface("aaaaaaaaa"))
    println(tInterface(true))
    println(tInterface(23.23))
  }

   def tInterface(a:Any): Any = {
     a
   }
}
