package exception

// fun main(){
//    val calculateResult = 10/0
//    println(calculateResult)
// }

fun main(){
    try {
        val calculateResult = 10/0
        println(calculateResult)
    }catch (e: ArithmeticException){
        println("Number cannot be divided by zero")
    }
}