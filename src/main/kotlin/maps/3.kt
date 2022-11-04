package maps

//index
fun main(){
    val map1 = mutableMapOf<String,Int>("key1" to 1,"key2" to 2,"key3" to 3)
    println(map1["key1"])
    println(map1.get("key2"))
}