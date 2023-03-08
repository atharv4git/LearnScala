case class Student(val name: String, val grade: Double)

object StudentGradeCalculator {
  def main(args: Array[String]): Unit = {
    // create some sample students
    val students = List(
      new Student("Alice", 85),
      new Student("Bob", 72),
      new Student("Charlie", 93),
      new Student("David", 68),
      new Student("Eve", 77)
    )

    // print out the average grade
    println("Average grade: " + averageGrade(students))

    // print out the highest and lowest grades
    val (highest, lowest) = highestAndLowestGrades(students)
    println("Highest grade: " + highest)
    println("Lowest grade: " + lowest)

    // print out the grade distribution
    printGradeDistribution(students)
  }

  def averageGrade(students: List[Student]): Double = {
    students.map(_.grade).sum/students.length
  }

  def highestAndLowestGrades(students: List[Student]): (Double, Double) = {
    (students.map(_.grade).max,students.map(_.grade).min)
  }

  def printGradeDistribution(students: List[Student]): Unit = {
    val grades = students.map(_.grade)
    val Ps = List(
        grades.filter(x => x>40 && x <= 50),
        grades.filter(x => x>50 && x <= 60),
        grades.filter(x => x>60 && x <= 80),
        grades.filter(x => x>80 && x <= 90),
        grades.filter(x => x>90)
    )
    val valPs = List(40,50,60,80,90)
    var k = 0
    for(i <- Ps){
        print(s"count of students who got ${valPs(k)}% in the test")
        print("| ")
        for(j <- 1 to i.length){print("🍞 ")}
        k=k+1
        print(i.length)
        println()
    }

  }
}
