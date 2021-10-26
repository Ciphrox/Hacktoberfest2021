package com.example

//Samples of some useful yet unpopular Kotlin functions

//Kotlin provides a standard library that is meant to augment,
// not replace, the standard Java library.
// There are many functions that adapt Java types and methods
// and allow them to be used as idiomatic Kotlin. In this chapter,
// we will cover some of the lower level functions that have far reaching use.
fun main() {

    //Take() 
    //Another useful function from Kotlin Kotlin standard library. This function will return/take n number of elements from a collcetion
    val numbersA = listOf("one", "two", "three", "four")

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


    //    Pair & Triple:
//    Have you ever thought that a function could return
//    more than two values without using the map, model, or data class?
//    No, not at all! But, with the help of `Pair` and `Triple` classes,
//    this isn't a pain anymore. We can have a method that can return up to three elements:

    fun getThreeElements(): Triple<String, Double, String> {
        return Triple("Learn Kotlin", 200.00, "Educational")
    }

    val data = getThreeElements()
    print(data.first)  //Output: Learn Kotlin
    print(data.second) //Output: 200.00
    print(data.third)  //Output: Educational

    fun getTwoElements(): Pair<String, Double> {
        return Pair("Learn Java", 300.00)
    }

    val twoElements = getTwoElements()
    print(twoElements.first)  //Output: Learn Java
    print(twoElements.second) //Output: 300.00




    //    Destructuring Declarations:
//    Destructuring declaration is the easiest way to create variables &
//    initialize all of them in a single line of code:

    val (id, name, age) = Person(101, "Harry Potter", 15)
    //Output: id = 101, name = Harry Potter, age = 15

    val (x, y, z) = arrayOf(1.3, 2.4, 3.8)
    //Output: x= 1.3, y= 2.4, z= 3.8

    val map = mutableMapOf(1 to "Harry", 2 to "Hermione", 3 to "Ron")
    for ((key, value) in map) print("Id: $key, Name: $value ,")
    //Output: Id: 1, Name: Harry, Id: 2, Name: Hermione, Id: 3, Name: Ron




    //String:
//    Daily we deal with many functionalities where it's required to manipulate
//    the strings. Earlier to avail various String functions in Android,
//    we had no option other than integrating the Apache Common library,
//    as Android's TextUtils class doesn't provide many functionalities. However,
//    Kotlin offers a variety of functions that helps to tweak and trick the output as per the requirement.
//    Let's take a look at a few of Kotlin's in-built useful
//    methods that save us from writing lengthy logics to achieve a requirement:

    "Ja49va1K7otl54in7".partition { "123456789".contains(it)}
    //Output: (4917547, JavaKotlin)

    "L7ea3rn 1Kotl8in 12".filter { it.isDigit() }
    //Output: 731812

    "L7ea3rn 1Kotl8in 12F".findLast { it.isDigit() }
    //Output:2
    //Similar methods: findAnyOf(), findLastAnyOf()

    "Learn Kotlin".all { it.isLowerCase() }
    //Output: false

    "Learn Kotlin".any { it.isLowerCase() }
    //Output: true

    "Learn Kotlin".dropLastWhile{it.isLowerCase()}
    //Output; Learn K
    //Similar methods: dropWhile{}, drop(), dropLast()

    "Learn Kotlin".associateWith { it.toUpperCase() }
    //Output: {L=L, e=E, a=A, r=R, n=N,  = , K=K, o=O, t=T, l=L, i=I}
    //Similar methods: associate{}, associateBy{}, associateByTo(), associateWithTo()

    "Line One\n Line Two \n Line Three".lines()
    //Output: [Line One,  Line Two ,  Line Three]

    "Learn Kotlin".replaceAfter(' ', "Java")
    //Output: Learn Java
    //Similar methods: replace(), replaceAfterLast(), replaceBefore(), replaceBeforeLast(), replaceFirst(), replaceIndentByMargin(), replaceRange(), replaceFirst()

    "Learn Kotlin".substringAfter("a")
    //Output: rn Kotlin
    //Similar methods: substring(), substringAfterLast(), substringBefore(), substringBeforeLast()

    "Android_App_Java".commonPrefixWith("Android_App_Kotlin")
    //Output: Android_App_
    //Similar methods: commonSuffixWith()

    "Learn Kotlin".removeSurrounding("L", "lin")
    //Output: earn Kot
    //Similar methods: removePrefix(), removeSuffix(), removeRange()

    "\t".isBlank()
    //Output: true
    //Similar methods: ifBlank{}, isNotBlank(), isNotBlank(), isNullOrBlank()

    "\t".isEmpty()
    //Output: false
    //Similar methods: ifEmpty{}, isNotEmpty(), isNullOrEmpty(), orEmpty()

    "Learning\tKotlin".trim('L','B', 'n')
    //Output: earning	Kotli
    //Similar methods: trimIndent(), trimMargin(), trimStart(), trimEnd(), trimStart('L'), trimEnd('n')

    "Learning Kotlin".padStart(20, '.')
    //Output: .....Learning Kotlin
    //Similar method: padEnd()

    "learning kotlin".capitalize()
    //Output: Learning kotlin
    //Similar method: decapitalize()
}