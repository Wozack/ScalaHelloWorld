package com.qa

object fizzbuzz{

  def main(args: Array[String]): Unit = {

    fizzBuzz("Tragic", "Malik", 100)
  }

  def fizzBuzz(str1:String, str2: String, int:Int): Unit = {


    for(i<-1 to int by 1){
      var word = ""

      if(i%3==0){
        word += str1
      }

      if(i%5==0){
        word += str2
      }

      if(!word.contains(str1) && !word.contains(str2)) {
        word = i.toString()
      }

       print(word+", ")

    }
  }
}
