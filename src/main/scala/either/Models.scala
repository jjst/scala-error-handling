package either

case class Cat(name: String, age: Int, color: Color)

case class Problem(errorMessage: String)

sealed trait Color

object Color {
  case object Black extends Color
  case object Grey extends Color
  case object White extends Color

  def fromString(s: String): Either[Problem, Color] = s.toUpperCase match {
    case "BLACK" => Right(Black)
    case "GREY" => Right(Grey)
    case "WHITE" => Right(White)
    case unparseable => Left(Problem(s"""Cannot parse '$unparseable' as Color"""))
  }
}

