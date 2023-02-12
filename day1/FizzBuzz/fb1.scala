import scala.io.StdIn

object fb1{
    def main(args: Array[String]) : Unit = {
        println("Enter a number:")
        val input = StdIn.readInt()
        for (i <- 1 to input){
            if(i%3==0){
                println("Fizz")
                if(i%5==0){
                    println("FizzBuzz")
                }
            }
            if(i%5==0){
                println("Buzz")
            }else{
                println(i)
            }
        }
    }
}