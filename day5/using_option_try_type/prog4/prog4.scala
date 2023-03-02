// Write a function that takes a string and a delimiter as input and returns
// a list of substrings split by the delimiter. If the input string is null or
// empty, return None.

import scala.util.Try
object prog4{
    def main(args: Array[String]): Unit = {
        // Option[Array[String]] is an Option type that could either be Some(array)
        // or None. To view its contents, you need to pattern match against it
        splitSubstring("abaaabaaaabaaab","b") match {
            case Some(array) => println(array.mkString(", "))
            case None => println("Array is empty")
        }
    }

    def splitSubstring(str:String, delim:String):Option[Array[String]]={
        if (str == null || str.isEmpty) {None}
        else {Try(str.split(delim)).toOption}
    }
}