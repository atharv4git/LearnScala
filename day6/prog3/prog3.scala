// Write a function that takes a list of integers and returns
// the sum of all the even numbers in the list.

object prog3{
    def main(args: Array[String]): Unit = {
        println(evenSum(List(1,2,3,4,5,6,7,8,9,10)))
    }

    def evenSum(list:List[Int]):Int={
        list.filter(n => n%2==0).sum
    }
}