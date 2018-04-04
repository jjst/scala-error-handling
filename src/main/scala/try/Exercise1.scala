package `try`


import scala.io.StdIn

object Exercise1 extends App {
  val factor = 7
  val input = StdIn.readLine("Enter your age :")

  val humanAge = try {
    input.toInt
  }
  val catAge = humanAge / 7
  println(s"Your are $catAge cat years old!")
}
