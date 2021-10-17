
    fun main(){

        println("Enter two numbers")

        var a= readLine()!!
        var b = readLine()!!

        var ai:Int=a.toInt()
        var bi:Int=b.toInt()

        println("Before swapping")
        println("Value of ai: $ai")
        println("Value of b1: $bi")

        val temp=ai
        ai=bi
        bi=temp
        println("After swapping")
        println("Value of ai: $ai")
        println("Value of b1: $bi")

    }
