package day3.BattleShips

class Player(size:Int) {
var board=Array.fill[Boolean](size,size)(false)
var won=false;
  def setup(): Unit ={
    println("enter the coordinates for your ships (x then y)")
    patrolBoat()


  }
  def showBord(): Unit ={
    for(i<-0 until size){
      println("|")
      for(j<-0 until size){
        if(board(j)(i)){
          print(".")
        }else{
          print("*")
        }
        print("|")

      }

    }
  }
  def patrolBoat(): Unit ={

    for(i<-1 to 2){
      println("enter the coordinates of the patrol boat")
      board(input)(input)=true
    }
  }
  def input() = scala.io.StdIn.readInt()
  def checkWin(enemy:Player):Boolean={
    for(row<- enemy.board){
      for(lol<-row){
        if(lol){
          return !lol
        }
      }
    }
    return true
  }
  def attack(enemy:Player): Unit ={//pass in the enemy :^)
    println("Enter coordinates for an attack")
    val x=input()
    val y=input()
    if(enemy.board(x)(y)){
      println("Enemy hit!!")
      enemy.board(x)(y)=false
      if(checkWin(enemy)){
        println("Yaya u win!!!!!!!!!")
      }else{
        attack(enemy)
      }
    }else{
      println("miss lol ur trash xD")
    }

  }
}
