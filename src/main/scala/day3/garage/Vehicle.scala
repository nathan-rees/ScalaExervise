package day3.garage

import scala.util.Random

trait Vehicle {
  var speed:Int

  override def toString: String = {
    return this.speed.toString()
  }
  def move: Unit ={
    val r=Random
    val scale=r.nextInt(10)
    println("the vehicle moved "+this.speed*scale+" metres in "+scale+" seconds")
  }


}
