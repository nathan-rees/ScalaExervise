package day2
import scala.io.Source
object keyboard extends App {
  val filename = "/home/qa-admin/Desktop/enable1.txt"
  var s="";
  for (line <- Source.fromFile(filename).getLines) {
  println(line)
  }
  }
