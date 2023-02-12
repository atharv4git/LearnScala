import scala.io.StdIn

object p1{
    def main(args: Array[String]):Unit={
        print("Enter anything:  ")
        val input = StdIn.readLine()
        val startTime = System.nanoTime
        println(s"the string: ${input} is a Palindrome:  ${checkPalin(input)}")
        val endTime = System.nanoTime
        val elapsedTime = (endTime - startTime) / 1000000.0
        println("Elapsed time: " + elapsedTime + " milliseconds")
    }

    def checkPalin(str: String):Boolean ={
        val rev = str.reverse
        return str == rev
    }
}