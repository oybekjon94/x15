package exception

fun main(){
    try {
        val a: Int = 10
        val b: Int = 5
        println("Division of $a and $b result in: ${a / b}")

    }catch (e: ArithmeticException){
        println("Division by zero ")
    }finally {
        println("Finally block is always executed")
    }
}