import chapter10.ArrayElement
import net.lingala.zip4j.ZipFile
import net.lingala.zip4j.model.ZipParameters
import net.lingala.zip4j.model.enums.EncryptionMethod

object TestObject extends App{

  abstract class Swimmer{
    def greet(name: String) : Unit
  }

  val human = new Swimmer {
    override def greet(name: String): Unit = {
      println(s"$name hello")
    }
  }

  human.greet("wonhyeong")

  def add(x: Int, y: Int) = x + y

  val addThree = add(3, _:Int)
  println(addThree(4))


  val list1 = Seq(1,2,3)
  val list2 = Seq(2,3,4)
  println(list1 ++ list2)
}
