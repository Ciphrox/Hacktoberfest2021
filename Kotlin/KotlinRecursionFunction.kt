package com.example

fun main(args: Array<String>) {
    print("Enter a positive integer number: ")
    val number: Int = Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
}

//recursive function
fun fact(num: Int): Int {
    return if (num == 1) {
        num
    } else {
        //function fact() calling itself
        num * fact(num - 1)
    }

//    Tail Recursion

//    In recursion the computation is done after the recursive call, the example of factorial we have seen above is an example of recursion or head recursion where to calculate the factorial of n we need the factorial of n-1.
//    In Tail recursion the computation is done at the beginning before the recursive call. In tail recursion the call to the recursive function occurs at the end of the function. Which means the computation is done first and then passed to the next recursive call.
//    Lets take an example of tail recursion.

    fun main(args: Array<String>) {
        val number = 6
        val factorial = fact(number)
        println("Factorial of $number = $factorial")
    }

    tailrec fun fact(n: Int, temp: Int = 1): Int {
        return if (n == 1){
            temp
        } else {
            fact(n-1, temp*n)
        }
    }
}