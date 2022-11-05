package `when`

fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

fun main(){
    var num = 8
    when{
        isOdd(num) -> println("Odd")
        isEven(num) -> println("Even")
        else -> println("neither even nor odd")
    }
}