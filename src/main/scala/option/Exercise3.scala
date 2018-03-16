package option

trait MicrochipApiClient {
  def getMicrochip(id: String): Microchip
}

class MicrochipService(catStore: CatStore, microchipApiClient: MicrochipApiClient) {
  def getMicrochipMetadata(catName: String): Option[Microchip.Metadata] = {
    for {
      cat <- catStore.getCat(catName)
      microchip <- Some(microchipApiClient.getMicrochip(cat.name))
    } yield microchip.metadata
  }
}

object Exercise3 extends App {

  val catStore = new ProductionReadyCatStore(
    Cat(name = "Garfield", owner = Some(Owner("Jonathan Arbuckle"))),
    Cat(name = "Scratchy", owner = None)
  )

  val microchipService = new MicrochipService(catStore, new LegacyMicrochipApiClient())

  println(microchipService.getMicrochipMetadata("Garfield"))
  println(microchipService.getMicrochipMetadata("Scratchy"))
}
