package day5

object Main extends App {

    var player=new User()
  val computer=new BetterAI()
while(true){
  player.turn()
  computer.turn()
  player.checkWin(computer)
  computer.checkWin(player)
  printScores(player,computer)
}
  def printScores(p1:Player,p2: Player): Unit ={
    println("Player 1: "+p1.wins+" wins")
    println("Player 2: "+p2.wins+" wins")
  }



}
