package option

import java.time.ZonedDateTime

object Microchip {
  type Metadata = Map[String, Any]
}

case class Microchip(id: String, metadata: Map[String, Any])

class LegacyMicrochipApiClient extends MicrochipApiClient {
  override def getMicrochip(id: String): Microchip = {
    if (id == "Garfield") {
      Microchip("Garfield", Map(
        "inserted" -> ZonedDateTime.parse("2012-06-30T12:30:40Z[UTC]"),
        "lastVeterinaryVisit" -> ZonedDateTime.parse("2013-04-30T12:30:40Z[UTC]"),
        "comments" -> "A very lazy cat, he should eat less food")
      )
    } else {
      // I don't know that cat! I'm just going to return null. Surely the developer
      // can take care of this...
      null
    }
  }
}

