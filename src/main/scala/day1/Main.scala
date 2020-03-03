package day1

object Main {

  def main(args: Array[String]): Unit = {
    println(addSmallMultBy(1,4,7))
  }

  def num(A:Int,B:Int,C:Int): Unit ={

  }
  def bottlesOfBeer(number:Int): Unit ={
    for(num <-number until 0 by -1){
      println(num)
      println(num-1)
    }
  }
def addSmallMultBy(a:Int,b:Int,c:Int): Int ={
  val nums=List(a,b,c).sorted
  nums[0]+nums[1]*(nums[2])
  List.n
}

}
