package sets

fun main(){
    val set = setOf<Int>(1,33,2,5,6,7,843)
    set.forEach {
        println(it)
    }
    val sortedSet = set.sorted()
    sortedSet.forEach{println(it)}
}