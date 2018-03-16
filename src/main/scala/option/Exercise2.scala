package option

class ProductionReadyCatStore(cats: Cat*) extends CatStore {
  val nameToCat: Map[String, Cat] = cats.map(c => (c.name, c)).toMap

  override def getCat(name: String): Option[Cat] = {
    // Implement this!
    // Hint: use the `nameToCat` map defined above.
    ???
  }
}

object Exercise2 extends App {

  val catStore = new ProductionReadyCatStore(
    Cat(name = "Garfield", owner = Some(Owner("Jonathan Arbuckle"))),
    Cat(name = "Scratchy", owner = None)
  )

  val catService = new CatService(catStore)

  println(catService.getOwnerName("Garfield")) // This should give back Jon Arbuckle
  println(catService.getOwnerName("Scratchy")) // This should give back nothing
  println(catService.getOwnerName("Fido")) // This should give back nothing as well - who would name their cat Fido?
}
