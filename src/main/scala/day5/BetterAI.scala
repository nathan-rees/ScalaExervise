package day5

class BetterAI extends AI {
  var past = collection.mutable.Map(0 -> "ROCK",0->"SCISSOR",0->"PAPER")

  override def checkWin(enemy: Player): Boolean = {
    past++enemy.hand
    for(p<-past){
      println("looooool"+p._1+p._2)
    }

    super.checkWin(enemy)

  }
}
