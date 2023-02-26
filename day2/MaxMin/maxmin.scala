import scala.io.StdIn

object maxmin{
    def main(args: Array[String]):Unit={
        println("Enter the elements of the array separated by spaces:")
        val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
        println(find(arr))
    }
    def find(arr: Array[Int]):(Int,Int)={
        val arr2 = arr.sorted
        return (arr2(0),arr2(arr2.length-1))
    }
}