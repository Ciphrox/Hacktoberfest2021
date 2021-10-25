package com.example

fun main(args: Array<String>) {
    print("Enter a positive integer number: ")
    val number: Int =Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
}

//recursive function
fun fact(num: Int): Int {
    return if(num == 1){
        num
    }
    else{
        //function fact() calling itself
        num*fact(num-1)
    }
}