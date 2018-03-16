package either

object CatParser {
  def fromString(s: String): Either[Problem, Cat] = {
    // Implement cat parser.
    // It needs to build a Cat by parsing a string of the form:
    // "<name> <age> <color>"
    // Use `Color.fromString` to build a Color.
    // Bonus: reject negative ages
    ???
  }
}

object Exercise1 extends App {
  CatParser.fromString("Sylvester 16 black") // Should return Right(Cat(...))
  CatParser.fromString("Blah") // Should return Left(Problem(...))
}
