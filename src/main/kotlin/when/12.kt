package `when`

fun main(){
    val a = 2
    val b = 2

    println("enter operator either +,-,* or /")
    val operator = readLine()

    val result  = when(operator){
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        "/" -> a/b
        else -> "$operator operator is invalid operator"
    }
    println("result = $result")
}