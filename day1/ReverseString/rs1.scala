import scala.io.StdIn

object rs1{
    def main(args: Array[String]) : Unit = {
        print("Enter a string:  ")
        val str_original = StdIn.readLine()
        println(s"reverse of $str_original is ${rev(str_original)}")
    }

    def rev(input:String):String={
        val len  = input.length-1
        println(s"Length :  ${len}")
        println(s"First Letter:  ${input(0)}")
        println(s"Last Letter:  ${input(len)}")

        val output = new StringBuilder()
        for (i <- len to 0 by -1){
            output += input(i)
        }
        return output.toString()
    }
}