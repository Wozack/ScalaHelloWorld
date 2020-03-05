package com.qa

//Create a method that accepts two parameters, one being a string and one being an integer.
//You method should return the amount of characters from the end of the string that the
//integer specifies
//e.g.
//Input -> (Hello,3)
//Output -> llo

object Strings {

  def main(args: Array[String]): Unit = {

    println(strings("hello",3))
    strings2("ha", "llo", chr1 = 'a', chr2 = 'e')
  }

  def strings(str:String, num:Int): String = {
    var word = ""

    for(i <-  str.length()-num to str.length()-1 by +1){

      word += str.charAt(i)
    }

    word
  }
//========================================================================================================
  //Create a method that accepts 4 parameters, two being a String and two being a character,
  //your method will then join both strings together and then replace all occurrences of the
  //character provided with the second character provided.
  //Input-> (Ha, llo, a, e)
  //Output-> Hello

  def strings2(str1:String, str2:String, chr1:Char, chr2:Char): Unit = {

    var word = str1+str2

    word = word.replace(chr1, chr2)

    println(word)
  }

}
