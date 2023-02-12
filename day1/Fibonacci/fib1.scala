import scala.io.StdIn

object fib1{
    def main(args: Array[String]):Unit={
        print("Enter a number:  ")
        val num = StdIn.readInt()
        val startTime = System.nanoTime
        for (i <- 0 to num){
            print(s"${fib(i)}\t")
        }
        val endTime = System.nanoTime
        val elapsedTime = (endTime - startTime) / 1000000.0
        println("Elapsed time: " + elapsedTime + " milliseconds")
    }

    def fib(num: Integer, memo: Array):Integer={
        if(num == 0 | num == 1){
            return num
        }
        return fib(num-1) + fib(num-2)
    }
}