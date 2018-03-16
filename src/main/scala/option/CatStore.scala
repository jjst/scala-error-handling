package option

case class Cat(name: String, owner: Option[Owner]) {
  def hasOwner = owner.isDefined
}

case class Owner(name: String)

trait CatStore {
  def getCat(name: String): Option[Cat]
}
