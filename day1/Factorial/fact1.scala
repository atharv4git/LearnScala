import scala.io.StdIn

object fact1{
    def main(args: Array[String]):Unit={
        print("Enter a number:  ")
        val input = StdIn.readInt()
        println(s"The factorial of ${input} is ${factorial(input)}")
    }

    def factorial(num: Integer):Integer={
        if(num==0|num==1){
            return num
        }
        return num * factorial(num-1)
    }
}