package com.example

//A sealed class is used for representing restricted class
// hierarchy where an object or a value can have one of the types
// from a limited set of values. You can think of a sealed class as
// an extension of enum class. The set of values in enum class is also restricted,
// however an enum constant can have only single instance while a subclass of a
// sealed class can have multiple instances.
//
//Why we need a Sealed class?
//Lets first understand the need of a sealed class. In the following example we have a class Color which has three subclasses Red, Orange and Blue.
//Here the when expression in eval() method must use a else branch else we will get a compilation error. Now if we try to add a subclass to the class Color, the code in the else branch will execute which is a default code. The compiler should warn us that the code for the newly added sub class doesn’t exist and thus we should get a warning or error for adding a new subclass without adding the logic in when expression. This problem is solved using Sealed class.


open class Color {
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
}

fun eval(c: Color) =
    when (c) {
        is Color.Red -> println("Paint in Red Color")
        is Color.Orange -> println("Paint in Orange Color")
        is Color.Blue -> println("Paint in Blue Color")
        else -> println("Paint in any Color")
    }

fun main(args: Array<String>) {
    val r = Color.Red()
    eval(r)
}


//In Kotlin, sealed class is declared using the sealed keyword just before the class keyword in the class header.

//Lets take the same example that we have seen above using the sealed class. Here we have solved the above problem by marking the class Color as sealed.

//A sealed class as name suggests only take the values from a limited set of values. Here else branch is not mandatory in when expression because compiler knows that the class is sealed and it only needs the expression for the three derived classes, no default else branch needed. Now if we try to add the new subclass to the class Color, it would not create unnecessary bugs rather it would throw an error.

//For example if we add a new subclass White to the sealed class Color and do not add the expression for White subclass in when expression then we will get this error – Error:(12, 9) Kotlin: 'when' expression must be exhaustive, add necessary 'is White' branch or 'else' branch instead

sealed class Color {
    class Red : Color()
    class Orange : Color()
    class Blue : Color()
}

fun eval(c: Color) =
    when (c) {
        is Color.Red -> println("Paint in Red Color")
        is Color.Orange -> println("Paint in Orange Color")
        is Color.Blue -> println("Paint in Blue Color")
    }

fun main(args: Array<String>) {
    val r = Color.Red()
    eval(r)
}

//Rules of a Sealed class in Kotlin
//1. We cannot create the object of a sealed class which means a sealed class cannot be instantiated.
//2. All the subclasses of a sealed class must be declared within the same file where the sealed class is declared.
//3. The constructor of sealed class is by default private and we cannot make it non-private.

