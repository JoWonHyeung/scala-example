package chapter9

object ByNameParameterExample extends App {


  var assertionsEnabled = false
  val x = 5
  // not by-name parameter
  //def myAssert(predicate: () => Boolean) =
  //  if(assertionsEnabled && !predicate())
  //    throw new AssertionError

  // by-name parameter
  def byNameAssert(predicate: => Boolean) =
    if(assertionsEnabled && !predicate)
      throw new AssertionError

  byNameAssert(x / 0 == 0)

  def boolAssert(predicate: Boolean) =
    if(assertionsEnabled && !predicate)
      throw new AssertionError



}
