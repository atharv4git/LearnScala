object test{
    def main(args: Array[String]):Unit={
        var arr = Array.fill(10)(0)
        var j = 0
        for(i <- 0 to arr.length-1){
            println(s"${arr(i)} -- before")
            arr(i) = j
            j+=1
            println(s"${arr(i)} -- after")
        }
        println()
    }

    def fib(num: Integer, memo: Array(num)):Integer={
        if(num == 0 | num == 1){
            return num
        }
        if(memo(i)!=0){
            return memo(i)
        }
        memo(i) = fib(num-1) + fib(num-2)
        return memo(i)
    }

    def fibo(num: Integer):Array={
        var memo = Array.fill(num)(0)
        fib(num,memo)
    }
}