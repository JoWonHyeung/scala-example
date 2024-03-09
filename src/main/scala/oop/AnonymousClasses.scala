package oop

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahah")
  }

  funnyAnimal.eat

  class  Person(name: String) {
    def sayHi: Unit = println(s"hi, my name is $name, how can i help?")
  }

  val jim = new Person("jim") {
    override def sayHi = println(s"hi, my name is jim")
  }

  jim.sayHi
}
