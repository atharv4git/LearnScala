import todolist.*
object main{
    def main(args: Array[String]): Unit = {
        view_list(viewTasks())
        addTask()
        view_list(viewTasks())
    }
    def view_list(l:List[Todo]):Unit={
        for(i <- l){
            println(i)
        }
    }
}