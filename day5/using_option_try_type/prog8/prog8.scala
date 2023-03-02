// Write a function that takes a string as input and returns the first character
// of the string. If the input string is null or empty, return None.

import scala.util.Try
object prog8{
    def main(args: Array[String]): Unit = {
        println(firstChar("atharv"))
    }

    def firstChar(str:String):Option[Char]={
        if(str==null){None}
        else{Try(str(0)).toOption}
    }
}