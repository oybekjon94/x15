package exception

fun main(){
    val a: Int = 20
    val b: Int = 5
    val div: Int = try {
        a/b
    }catch (e: ArithmeticException){
        -1
    }
    println("The division of a and b is: $div")
}