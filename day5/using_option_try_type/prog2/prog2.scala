// Problem: Write a function that takes a string as input and
// returns the integer value of the string if it represents a
// valid integer. If the input string is null or empty or does
// not represent a valid integer, return None.

import scala.util.Try
object prog2{
    def main(args: Array[String]): Unit = {
        val string_input = "123"
        println(parseInt(string_input))
    }
    def parseInt(str: String): Option[Int] = {
        if (str == null || str.isEmpty) {
            None
        } else {
            Try(str.toInt).toOption
        }
    }

}