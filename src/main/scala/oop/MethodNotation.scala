package oop

import scala.language.postfixOps

object MethodNotation extends App{

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def +(nickname : String) : Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def apply() = s"$name, $favoriteMovie"
    def apply(time : Int) : String = s"$name watched inception $time times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("mary","inception")

  println((mary + "the rockstar")())
  println((mary + "the rockstar").apply())

  println((+mary).age)
  println(mary learns "math")
  println(mary.learns("math"))
  println(mary.apply(2))
  println(mary.learnsScala)
}

