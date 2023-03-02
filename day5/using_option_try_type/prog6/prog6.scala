// Write a function that takes two integers as
// input and returns the result of dividing the
// first integer by the second. If the second integer
// is 0 or the input integers are null, return None.

import scala.util.Try
object prog6{
    def main(args: Array[String]): Unit = {
        println(divInt(1,5))
    }
    
    def divInt(a:Int, b:Int):Option[Int]={
        if(b == 0){None}
        else{Try(a/b).toOption}
    }
}