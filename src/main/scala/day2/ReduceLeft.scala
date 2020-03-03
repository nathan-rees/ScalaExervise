package day2

object ReduceLeft extends App {
  println(mult(7,"5"))
  println(strings2("hal","lo",'a','e').toString())
  println(sum(12,12,false))
  pasd("hi",4)

  def output[A](x:A): A ={
    x
  }

  def mult(x:Int,y:String): Int ={
    x*y.toInt
  }

  def strings2(a:String,b:String,c: Char,d:Char) ={
  var s=new StringBuilder(a);
    s.append(b)
    var ss=new StringBuilder("")

    s.map(x=>if(x==c){ss+=d}else{ss+=x})
  ss.toString()
  }
def sum(a:Int,b:Int,c:Boolean): Int ={

  if(c==true){return(a+b)}
  return a*b
}
  def pasd(s:String,num: Int): Unit ={
    for(i<- 1 to num){
      println(s)
    }
  }
  def blackjack(a:Int,b:Int): Unit ={
    if(a>21&&b>21){
      return 0
    }
  }


}

