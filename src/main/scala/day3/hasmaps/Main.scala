package day3.hasmaps

import scala.io.Source

object Main {

def readFile(): Vector[String] ={
  val filename = "/home/qa-admin/Desktop/enable1.txt"
  Source.fromFile(filename).getLines.toVector
  }

}

