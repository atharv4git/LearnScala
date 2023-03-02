// Problem: Write a function that takes two lists of integers
// as input and returns a list of their common elements. If the
// input lists are empty or null, return None.

object prog1{
    def main(args: Array[String]): Unit = {
        val l1 = List(1,2,3,4,5,6)
        val l2 = List(1,3,5,7,8,10)
        println(commonElements(l1,l2))
        println(commonElements(l1,l2).getClass)
    }
    def commonElements(list1: List[Int], list2: List[Int]): Option[List[Int]] = {
        if (list1 == null || list2 == null || list1.isEmpty || list2.isEmpty) {
            None
        } else {
            Some(list1.intersect(list2))
        }
    }

}