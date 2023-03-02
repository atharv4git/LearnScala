// Write a function that takes a list of strings
// and a search string as input and returns the
// index of the first occurrence of the search
// string in the list. If the search string is
// not found or the input list is null, return None.

import scala.util.Try
object prog5{
    def main(args: Array[String]): Unit = {
        val strList = List("a","b","c","d")
        println(searchListString(strList,"c"))
    }

    def searchListString(strlist:List[String], target:String):Option[Int]={
        for(idx <- 0 until strlist.length){
            if(target == strlist(idx)){return Try(idx).toOption}
        }
        None
    }
}