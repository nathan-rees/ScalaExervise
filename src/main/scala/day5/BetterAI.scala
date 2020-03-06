package day5

class BetterAI extends AI {
  var past = collection.mutable.Map(0 -> "ROCK",0->"SCISSOR",0->"PAPER")

  override def checkWin(enemy: Player): Boolean = {
    past++enemy.hand
    for(p<-past){
    }
    super.checkWin(enemy)
  }

  override def turn(): Unit = {
    if(past.max._2=="ROCK"){
      this.hand="PAPER"
    }else if(past.max._2=="PAPER"){
      this.hand="SCISSOR"
    }else{
      this.hand="ROCK"
    }

  }
}
