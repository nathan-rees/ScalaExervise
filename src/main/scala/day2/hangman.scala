//package day2
//
//import scala.io.Source
//import scala.util.Random
//object hangman extends App{
//
//  val filename = "/home/qa-admin/Desktop/enable1.txt"
//  val r=new scala.util.Random
//  val words=Source.fromFile(filename).getLines.toList
//
//  val num=Math.abs(r.nextInt(Source.fromFile(filename).getLines.length))
//  val word= words(num).toCharArray()
//  var found=false
//var hidden=""
//  for(i<- 1 to word.length){
//    hidden+="_"
//  }
//
//  while(!found){
//    println(hidden)
//    val input=scala.io.StdIn.readLine()
//
//    if(word.contains(input)){
//      for(j<-0 until 10){
//
//      }
//      for(i<-0 until word.length){
//        if(word[i]=input){
//
//          hidden[i]=input
//        }
//      }
//    }
//
//  }
//
//def printLength(s:String): Unit ={
//  for(letter<- s){
//    print("_.")
//  }
//}
//}
