package dataClass

data class User3(val name: String, val age: Int)

fun main(){
    val a1 = User3("oybek",29)

    // using copy function to create an object
    val a2 = a1.copy(name = "doston")

    println("a1: name = ${a1.name}, name = ${a1.age}")
    println("a1: name = ${a2.name}, name = ${a2.age}")
}