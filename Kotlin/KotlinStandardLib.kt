package com.example

//Samples of some useful yet unpopular Kotlin functions
fun main() {

    //Take() 
    //Another useful function from Kotlin Kotlin standard library. This function will return/take n number of elements from a collcetion
    val numbersA =  listOf("one", "two", "three", "four")

    //this will print (one,two)
    println(numbersA.take(2))

    //this will print (three,four)
    println(numbersA.takeLast(2))





    //Drop()
    //the drop function is opposite to the take function
    val numbers = listOf("one", "two", "three", "four")

    //this will print (three,four)
    println(numbers.drop(2))

    //this will print (one,two)
    println(numbers.dropLast(2))

    //Here, we are dropping first element from the list whose length is equal to 3.
    //this will print (three,four)
    println(numbers.dropWhile {
        it.length == 3
    })

    //Here, we are dropping last element from the list whose length is equal to 4.
    //this will print (one,two,three)
    println(numbers.dropLastWhile {
        it.length == 4
    })

}