package maps

fun main(){

    //containsKey : A function to check if the corresponding key exists in the Map
    //containsValue : A function to check if the value exists in the Map
    val map1 = mutableMapOf<String,Int>("key1" to 1,"key2" to 2,"key3" to 3)
    println(map1.containsKey("key1"))
    println(map1.containsKey("key4"))
    println(map1.containsValue(1))
    println(map1.containsValue(1))

    //remove(key) : A function that deletes the data with the corresponding key.
    map1.remove("key1")
    println(map1)
}

