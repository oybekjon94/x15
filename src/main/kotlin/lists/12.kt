package lists

fun main(){
    val list = listOf('a','b','c')
    println(list.size)
    println("list.contains('a') is ${list.contains('a')}")
    println(list.indexOf('b'))
    println(list[2])
}