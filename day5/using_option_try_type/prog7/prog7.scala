// Write a function that takes a list of integers as input
// and returns the maximum value in the list. If the input
// list is null or empty, return None.

import scala.util.Try
object prog7{
    def main(args: Array[String]): Unit = {
        println(whatsMax(List()))
    }
    
    def whatsMax(intlist:List[Int]):Option[Int]={
        if(intlist.isEmpty || intlist == null){None}
        else{Try(intlist.max).toOption}
    }
}