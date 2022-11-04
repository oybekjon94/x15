package maps

fun main(){
    val dictionary = mapOf("Hello" to "salom", "bye" to "hayr")
    //is there such a key here?
    println(dictionary.containsKey("Hello"))
    println(dictionary.containsKey("helloq"))
    //is there such a value here?
    println(dictionary.containsValue("salom"))
    println(dictionary.containsValue("hi"))

}