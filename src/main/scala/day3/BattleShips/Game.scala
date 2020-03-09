package day3.BattleShips

object Game extends App{

  val player1=new Player(10)
  player1.showBord()
  player1.setup()
  var win=false
  val player2=new Player(2)
  while(!win){
    println("Player 1...")

    player1.attack(player2)
    player1.showBord()
    println("Player 2...")
    player2.attack(player1)
  }




}
