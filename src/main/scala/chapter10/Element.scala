package chapter10
import Element.elem
object Element {
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  def elem(line: String): Element =
    new LineElement(line)
}

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if(height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    elem(this.contents ++ that.contents)

  def beside(that: Element) = {
    elem(
      for(
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }

  override def toString: String = contents mkString "\n"
}
