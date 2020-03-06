package day5

class BetterAI extends AI {
  var past = scala.collection.mutable.Map("ROCK"->0,"SCISSOR"->0,"PAPER"->0)

  override def checkWin(enemy: Player): Boolean = {
    past++enemy.hand
    super.checkWin(enemy)
  }

  override def turn(): Unit = {
    if(past.max._1=="ROCK"){
      this.hand="PAPER"
    }else if(past.max._1=="PAPER"){
      this.hand="SCISSOR"
    }else{
      this.hand="ROCK"
    }

  }
}
