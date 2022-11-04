package maps

fun main(){
    val dictionary = mapOf("Hello" to "salom", "bye" to "hayr", 1 to 2,"one" to 4)
        val value = dictionary.get("one")
    println(value)
}