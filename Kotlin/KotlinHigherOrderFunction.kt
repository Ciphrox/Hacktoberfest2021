package com.example

//passing a funciton to another fuction
fun main(args: Array<String>) {

    func("BeginnersBook", ::demo)

}

fun func(str: String, myfunc: (String) -> Unit) {
    print("Welcome to Kotlin tutorial at ")
    myfunc(str)
}

fun demo(str: String) {
    println(str)
}
