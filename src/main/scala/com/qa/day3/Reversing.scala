package com.qa

//Pattern Matching 2
//Create a method that takes a pair of integers and then returns the pair swapped around
//using pattern matching
//Input-> 1,2
//Output->2,1
//Your method should work with a List, Array and Tuple input.
//Additional – Accept a Collection that has more than two inputs and returns the collection
//with the first two



object Reversing {

  def main(args: Array[String]): Unit = {
    reverser(List(1, 2))
    reverser(1, 2)
    reverser(Array(1, 2))

  def reverser(input: Any): Unit = input match{
    case input @ List(_,_) => println(input.reverse)
    case input @ Array(_,_) => println(input(1) + " " +input(0))
    case input @ (_,_) => println(input.swap)
  }

  }
}
