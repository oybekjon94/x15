package nullable

fun strLensSafe(s: String?): Int =
    if(s != null) s.length else 0

fun main(){
    val x: String? = null
    println(strLensSafe(x))
    println(strLensSafe("abs"))
}