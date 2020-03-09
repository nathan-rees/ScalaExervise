package day5

class User extends Player
{
  override def turn(): Unit = {
    println("Enter a move...")
    super.turn()
  }

  override def checkWin(enemy: Player) = {

    if(super.checkWin(enemy)) {
      this.wins = this.wins + 1
      println("You win!")
    }
    else{
      println("Try again..")
    }
     true
  }


}
