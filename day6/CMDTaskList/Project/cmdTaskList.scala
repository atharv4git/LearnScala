import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.io.FileWriter
import au.com.bytecode.opencsv.CSVWriter

case class Task(name:String, desc:String, done:Boolean, dt:LocalDateTime)

object cmdTaskList{
    def main(args: Array[String]): Unit = {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val dateTime = LocalDateTime.parse("2022-03-01 10:30:00", formatter)
        val tasks = List(
            new Task("t1", "desc1", false, dateTime),
            new Task("t2", "desc2", true, dateTime)
        )
        csv_write(tasks)
    }

    def csv_write(tasks:List[Task])={
        val writer = new CSVWriter(new FileWriter("tasks.csv"))
        writer.writeNext(Array("Name", "Description", "Status", "DateTime"))
        tasks.foreach(task => {
        val rowData = Array(task.name, task.desc, task.done, task.dt)
        writer.writeNext(rowData)
        })
        writer.close()
    }
}