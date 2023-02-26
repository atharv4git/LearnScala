import scala.io.StdIn

object avg{
    def main(args: Array[String]):Unit={
        println("Enter the elements of the array separated by spaces:")
        val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
        println()
        val sortedArr = arr.sorted
        println(s"The original array was:  ${arr.mkString(", ")}\nThe sorted array was: ${sortedArr.mkString(", ")}\nThe avg is:  ${sortedArr.sum/sortedArr.length}")
    }
}