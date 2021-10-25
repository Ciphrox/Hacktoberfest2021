package com.example

//In the following example there is an exception in the inner try block but the occurred exception (ArithmeticException) is not handled in the inner catch blocks so the outer catch blocks are checked for this exception, since outer catch block is handling this exception, the code inside outer catch block is executed for ArithmeticException.
//
//There can be more than one try catch blocks in a try block, also there can be a try catch block inside the inner try block as well. The only thing to take note here is that if the exception is not handled in the child try catch block, then the handlers of parent try catch blocks are checked for the occurred exception
fun main(args: Array<String>) {
    try {
        val num = 100 / 5
        println(num)
        try {
            val num2 = 100 / 0
            println(num2)
        } catch (e: NumberFormatException) {
            println("Number Format Exception")
        }
    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    }
}