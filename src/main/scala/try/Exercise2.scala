package `try`

import scala.io.StdIn
import scala.util.{Failure, Success, Try}

object GenericAnimalAgeCalculator {

  def calculateAge(input: String, ageFactor: String): Try[Int] = {
    ???
  }
}

object Exercise2 extends App {
  val humanAge = StdIn.readLine("Enter your age :")
  val factor = StdIn.readLine("Enter the human-to-animal ratio:")

  GenericAnimalAgeCalculator.calculateAge(humanAge, factor) match {
    case Success(age) => println("You are $age cat years old.")
    case Failure(_) => println("Enter a valid value please.")
  }
}
