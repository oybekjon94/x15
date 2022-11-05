package overloading

fun main(){
    println(number(20,30))
    println(number(20.3,30.4))
    println(number(20,30,49))
}
fun number(a: Int,b:Int) = if (a<b)"a: small" else "b: bigger"
fun number(a: Double,b:Double) = if (a<b)"a: small" else "b: bigger"

fun number(a: Int,b:Int,c:Int) =
    when{
        a >= b && a >= c -> a
        a >= b && b >= c -> b
        else -> c
    }