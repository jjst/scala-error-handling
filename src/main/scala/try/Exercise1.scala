package `try`


import scala.io.StdIn

object Exercise1 extends App {
  val factor = 7
  val defaultAge = 30
  val input = StdIn.readLine(s"Enter your age [$defaultAge]:")

  val humanAge = input.toInt
  val catAge = humanAge / 7
  println(s"Your are $catAge cat years old!")
}
