package maps

fun main(){
    val dictionary = mapOf("Hello" to "salom", "bye" to "hayr")
    // only keys are output
    for (key in dictionary.keys){
        println(key)
    }
    // only values are output
    for (value in dictionary.values){
        println(value)
    }
}