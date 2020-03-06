package day5

trait Player {
var hand=""
  var wins=0;
  def turn(): Unit ={
    this.hand=input()

  }
private def input():String ={
  scala.io.StdIn.readLine().toUpperCase()
}
  def checkWin(enemy:Player):Boolean ={
    if(this.hand=="ROCK"&&enemy.hand=="SCISSOR"||(this.hand=="SCISSOR"&&enemy.hand=="PAPER")||(this.hand=="PAPER"&&enemy.hand=="ROCK")){
       return true
    }else if(this.hand==enemy.hand) {
      println("Draw...")
    }
    false
  }

}
