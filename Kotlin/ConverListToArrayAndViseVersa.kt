package com.example

//Kotlin Program to Convert List (ArrayList) to Array and Vice-Versa
fun main() {

//    Example 1: Convert array list to array
    // an arraylist of vowels
    val vowels_list: List<String> = listOf("a", "e", "i", "o", "u")

    // converting arraylist to array
    val vowels_array: Array<String> = vowels_list.toTypedArray()

    // printing elements of the array
    vowels_array.forEach { System.out.print(it) }

    //    Example 2: Convert array to array list

    // vowels array
    val vowels_array: Array<String> = arrayOf("a", "e", "i", "o", "u")

    // converting array to array list
    val vowels_list: List<String> = vowels_array.toList()

    // printing elements of the array list
    vowels_list.forEach { System.out.print(it) }
}