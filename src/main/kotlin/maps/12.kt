package maps

fun main(){
    val dictionary = mapOf("Hello" to "salom", "bye" to "hayr")
    for ((key, value) in dictionary){
        println("$key is uzbek translation -> $value")
    }
}