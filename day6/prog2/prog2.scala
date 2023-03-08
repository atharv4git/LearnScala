// Write a function that takes a list of integers and returns a new
// list where each element is multiplied by 2.

object prog2{
    def main(args: Array[String]): Unit = {
        val list = List("hello","there")
        println(firstCap(list))
    }

    def firstCap(list:List[String]):List[String]={
        list.map(_ .capitalize)
    }
}