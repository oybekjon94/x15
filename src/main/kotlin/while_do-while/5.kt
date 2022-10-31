package `while_do-while`

fun main(){
    val num: Int  = 2
    var i: Int = 1
    do {
        println("$num + $i = ${num + i}")
        i++
    }while (i <= 10)
}