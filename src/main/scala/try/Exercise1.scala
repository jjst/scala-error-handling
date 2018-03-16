package `try`

import scala.io.StdIn
import scala.util.{Failure, Success, Try}

object CatAgeCalculator {

  def calculateCatAge(input: String, ageFactor: Int): Try[Int] = {
    // 1. Convert the input to an int (this can fail!)
    // 2. Divide the input by ageFactor
    ???
  }
}

object Exercise1 extends App {
  val factor = 7
  val humanAge = StdIn.readLine("Enter your age :")

  CatAgeCalculator.calculateCatAge(humanAge, factor) match {
    case Success(age) => println("You are $age cat years old.")
    case Failure(_) => println("Enter a valid value please.")
  }
}
