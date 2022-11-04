package sets

fun main(){
    val set = setOf<Int>(1,2,3,4,5,6,7)
    set.forEachIndexed {index, item ->
        println("$index=> $item")
    }
}