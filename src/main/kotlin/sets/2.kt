package sets

fun main(){
    val set = (1..10).toSet()
    println(set.maxOrNull())
    println(set.minOrNull())
    println(set.count())
}