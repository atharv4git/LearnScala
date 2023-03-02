// Write a function that takes a list of integers as input and returns the
// sum of the even numbers in the list. If the input list is null or empty, return None.

import scala.util.Try
object prog9{
    def main(args: Array[String]): Unit = {
        println(sumEven(List(1,2,3,4,5,6,7,8,9,10)))
    }

    def sumEven(list:List[Int]):Option[Int]={
        if(list.isEmpty){None}
        else if(list.length == 1){if(list(0)%2==0){Try(list(0)).toOption}}
        else{
            var sum = 0
            for(i <- 0 until list.length){
                if(list(i)%2==0){sum+=list(i)}
            }
            return Try(sum).toOption
        }
        return None
    }
}