package day3.garage

trait Person {
  var name:String

  def greet(): Unit ={
    println("Hi there! my name is "+name)
    println("Nice to meet you fren!")

  }
  def Person: Unit ={
    this.name=name
  }

  override def toString: String = {
    name
  }
}
