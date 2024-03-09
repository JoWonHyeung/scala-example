package chapter9

object FlowControlAbstractionExample extends App {

    def containsNeg(nums: List[Int]) : Boolean = nums.exists(_ < 0)

    println(containsNeg(List(1,2,-1)))
    println(containsNeg(List(1,2,3)))

}
