package day4

import scala.collection.mutable.ArrayBuffer

object Luhn extends App{
  println(Luhn("7997"))
  println("this lol ---->"+findLuhn("7997"))

  def Luhn(n: String) = {

    var nSum = 0
    var second = false
    for (i <- n.length - 1 to 0 by -1) {
      var d = n(i)-48//from string to num
      if (second) d = d * 2

      nSum += (d % 10)+(d / 10)

      second = !second
    }
    nSum % 10 == 0
  }
  def findLuhn(n:String):Int ={

    for(i<-0 until 10){
      if(Luhn(n+i.toString)){
        return i
      }
    }
    return -1
  }

}
