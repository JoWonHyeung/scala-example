package chapter12

object RectangleExample extends App {
  val rect = new Rectangle(new Point(1,1), new Point(10,10))
  println(rect)
}

class Point(val x: Int, val y: Int)

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  override def toString = s"(${topLeft.x},${topLeft.y}), (${bottomRight.x},${bottomRight.y})"
}

abstract class Component extends Rectangular {
}
