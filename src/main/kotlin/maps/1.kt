package maps

//A Map connects keys to values and looks up
// a value when given a key.
fun main(){
    // immutable map
    val map1 = mapOf("key1" to 1,"key2" to 2,"key3" to 3)
    val map2 = mapOf<String, Char>("key1" to '1',"key2" to '2',"key3" to '3')
    println(map1)

}