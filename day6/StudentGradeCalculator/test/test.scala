case class Student(val name:String, val grade:Double)

object test{
    def main(args: Array[String]): Unit = {
        val students = List(
        new Student("Alice", 85),
        new Student("Bob", 72),
        new Student("Charlie", 93),
        new Student("David", 68),
        new Student("Eve", 77)
    )

        val allValues = students.flatMap(_.productIterator)
        allValues.foreach(println)

        // for(i <- students){
        //     println(i.name)
        //     i.productIterator.foreach(println)
        // }
        println(students.map(_.grade).sum)
    }
}
