package day1

object Main {



  def num(A:Int,B:Int,C:Int): Unit ={

  }
  def bottlesOfBeer(number:Int): Unit ={
    for(num <-number until 0 by -1){
      println(num)
      println(num-1)
    }
  }


}
