import scala.io.StdIn
import scala.collection.mutable

object fact{
  def fact(n: Int, cache: mutable.Map[Int, Int] = mutable.Map.empty[Int, Int]): Int = {
    cache.getOrElseUpdate(n,
      if (n==0|n==1) n
      else n * fact(n - 1, cache)
    )
  }

  def main(args: Array[String]):Unit={
    print("Enter a number: ")
    val num = StdIn.readInt()
    println(s"factorial of $num is ${fact(num)}")
  }
}