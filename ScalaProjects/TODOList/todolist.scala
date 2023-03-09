import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import scala.io.StdIn

val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

case class Todo(id:Int, name:String, desc:String, taskDone: Boolean, datetime: LocalDateTime)

var todos = List(
            Todo(1,"name1", "desc1", false, LocalDateTime.parse("2022-03-01 10:30:00", formatter)),
            Todo(2,"name2", "desc2", true, LocalDateTime.parse("2022-03-01 11:30:00", formatter)),
            Todo(3,"name3", "desc3", false, LocalDateTime.parse("2022-03-01 12:30:00", formatter))
        )

object todolist{
    def main(args: Array[String]): Unit = {
        
    }
    def viewTasks():List[Todo]={
        todos
    }

    def addTask(): Unit = {
        println("Enter the name of the task: ")
        val name = StdIn.readLine()
        println("Enter the description of the task: ")
        val desc = StdIn.readLine()
        val taskDone = false
        var id = todos.length
        id=id+1
        val newTask = Todo(id,name, desc, taskDone, LocalDateTime.parse(LocalDateTime.now().format(formatter), formatter))
        println("Task added to the list successfully!")
        val newList = todos :+ newTask
        todos = newList
    }


    def delTask():List[Todo]={
        println("Enter the ID of task you want to delete: ")
        val toDelID = StdIn.readInt()
        println("Task removed from the list successfully!")
        todos.filter(_!=todos(toDelID-1))
    }
}
