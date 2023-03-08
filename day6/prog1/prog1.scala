// Write a function that takes a list of integers and returns a new
// list where each element is multiplied by 2.

object prog1{
    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4,5,6,7,8,9,10)
        println(mult2(list))
    }

    def mult2(list:List[Int]):List[Int]={
        list.map(_ * 2)
    }
}