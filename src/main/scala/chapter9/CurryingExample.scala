package chapter9

import java.io.{File, PrintWriter}
import java.util.Date

object CurryingExample extends App {

  // not curring
  def plainOldSum(x: Int, y: Int) = x + y

  // curring
  def curriedSum(x: Int)(y: Int) = x + y

  // loan pattern
  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try{
      op(writer)
    }finally {
      writer.close()
    }
  }

  val file = new File("test.txt")

  withPrintWriter(file){
    writer => writer.println(new Date())
  }


}
