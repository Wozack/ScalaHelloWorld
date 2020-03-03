package com.qa

//Operators
//Create a method that accepts two Integers as an input, then returns the sum of those
//integers.

//Conditionals
//Modify your method from the previous task to accept another parameter, a Boolean. Your
//method will now check if that Boolean is true, and if it is then it will return the sum of the
//two numbers provided, if it is false it will return the multiplication of the two numbers
//instead.

//Conditionals 2
//Modify your method from the previous task to have some more conditional statements to
//check if one of the numbers is 0, which if this is true then you should return the other non-0
//number.

object  Operators {

  def main(args: Array[String]): Unit = {

    println(addition(5, 8))
    println(onlyEvens(3,5))
  }

  def addition(num1:Int, num2:Int): Int = {
    val sum = num1 + num2

    sum
  }

  def onlyEvens(num1:Int, num2:Int): AnyVal = {

    if((num1%2 == 0)&&(num2%2 ==0)){
      val sum = num1 + num2
      sum

    }else if((num1==0)||(num2==0)){
      val sum = Int != 0
      sum

    }else{
      println("please enter odd numbers only")

    }

  }







}
