package day5

class AI extends Player {
  override def turn(): Unit = {
    val rand = scala.util.Random.nextInt(3)
    if(rand==0){
      this.hand="ROCK"
      println("The computer guesses ROCK")
    }else if(rand==1){
      this.hand="PAPER"
      println("The computer guesses PAPER")
    }else{
      this.hand="SCISSOR"
      println("The computer guesses SCISSOR")
    }
  }


  override def checkWin(enemy: Player): Boolean = {
    if(super.checkWin(enemy)){
      this.wins=this.wins+1
    }
    true
  }

}
