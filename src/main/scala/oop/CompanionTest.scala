package oop

object CompanionTest extends App{

  class MyClass {
    private def myClassMethod() : Unit = println("this is class method")
    MyClass.myObjectMethod()
  }

  object MyClass {
    private def myObjectMethod() : Unit = println("this is object method")
  }

  new MyClass()

  for(i <- List(1,2,3))
    println(i)


}
