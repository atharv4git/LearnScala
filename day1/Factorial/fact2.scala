import scala.collection.mutable

object fact2 {
   val cache: mutable.Map[Int, BigInt] = mutable.Map.empty[Int, BigInt]
   
   def main(args: Array[String]): Unit = {
      val n = 10
      println("The factorial of " + n + " is " + factorial(n))
   }
   
   def factorial(n: Int): BigInt = {
      cache.get(n) match {
         case Some(result) => result
         case None =>
            val result = if (n == 0) 1 else n * factorial(n - 1)
            cache.put(n, result)
            result
      }
   }
}
