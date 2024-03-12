import chapter10.ArrayElement

object TestObject extends App{

  val tuple1 = new ArrayElement(
    for(
      (line1, line2) <- Array("1","2","3") zip Array("4","5","6")
    ) yield line1 + line2
  )

  tuple1.contents.foreach(println _)
}
