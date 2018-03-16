package option

trait MicrochipApiClient {
  def getMicrochip(id: String): Microchip
}

class MicrochipService(catStore: CatStore, microchipApiClient: MicrochipApiClient) {
  def getMicrochipMetadata(catName: String): Option[Microchip.Metadata] = {
    // TODO: what is the problem with this code?
    // Try to fix it *without* changing MicrochipApiClient.
    // If you could change MicrochipApiClient, what would you do?
    catStore.getCat(catName).map { cat =>
      val microchip = microchipApiClient.getMicrochip(cat.name)
      microchip.metadata
    }
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
