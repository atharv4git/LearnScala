// Create a function to reverse a singly linked list using
// immutable data structures. The function should take a
// linked list as input and return a new linked list that
// is the reverse of the original.

object rev{
    def main(args: Array[String]): Unit = {
        val linkedList = List(1,2,3,4,5,6,7,8,9,10)
        println(s"original LinkedList: ${linkedList}")
        println(s"Reversed LinkedList: ${revLinkedList(linkedList)}")
    }
    def revLinkedList(list:List[Int]):List[Int]={
        return list.reverse
    }
}