package sets

//A Set is a collection that allows only one element of each value.
fun main(){
    val set = setOf<Int>(1,2,3,3)
    for (item in set){
        println(item)  // output 1 2 3
    }
}