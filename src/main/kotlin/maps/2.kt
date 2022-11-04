package maps

fun main(){
    // mutable map
    val map1 = mapOf<String, Int>("key1" to 1,"key2" to 2,"key3" to 3)
    val map2 = mapOf<String, Any>("key1" to '1',"key2" to 2.2,"key3" to "3")
    println(map1)
    println(map2)

}