package `try`

import scala.io.StdIn
import scala.util.{Failure, Success, Try}

object AgeCalculatorService {

  def calculateAge(humanAge: Int, ageMultiplier: Int = 7): Int = {
    require(humanAge >= 0, "Invalid human age! A human can't have a negative age, silly!")
    require(ageMultiplier > 0, "Invalid age multiplier, it has to be positive")
    humanAge / ageMultiplier
  }
}

object Exercise2 extends App {
  val humanAge = StdIn.readLine("Enter your age :")
  val ageMultiplier = StdIn.readLine("Enter the human-to-animal ratio:")

  // Use Try and a for-comprehension to do the following:
  // - parse the humanAge to an Int
  // - parse the ageMultiplier to an Int
  // - call calculateAge
  // If the result is a success, print it on standard out
  // Otherwise, print the message from the corresponding exception to stderr.
  AgeCalculatorService.calculateAge(-1, -1)
}
