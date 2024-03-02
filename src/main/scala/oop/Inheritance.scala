package oop

object Inheritance extends App{

  //single
  class Animal{
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal{
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat

  //cat.crunch

  // constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  // overriding
  class Dog(override val creatureType : String) extends Animal {
    //override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  val dog = new Dog("k9")
  //dog.eat
  //println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("k9")
  unknownAnimal.eat

  // overriding vs overloading

  // super

  // preventing overrides
  // 1 - use final on member : 오버라이딩 불가
  // 2 - use final on class : 상속 불가
  // 3 - seal the class = extend classes in this file, prevent extension in other files
}

