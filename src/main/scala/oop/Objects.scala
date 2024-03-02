package oop

object Objects extends App{

  // scala does not have class-level functionality ("static")
  object Person {
    val N_EYES = 2
    def canFly : Boolean = false

    // factory method
    def apply(mother: Person, father : Person) : Person = new Person("bobbie")
  }

  class Person(val name: String) {
    //instance-level functionality
  }
  //companion

  println(Person.N_EYES)
  println(Person.canFly)

  // scala object = singleton instance
  val mary = new Person("mary")
  val john = new Person("john")

  val bobbie = Person.apply(mary, john)

  println(bobbie)

  // scala application = scala object with
  // def main(args: Array[String]) : Unit
}
