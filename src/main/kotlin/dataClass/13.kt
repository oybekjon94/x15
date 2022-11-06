package dataClass

data class User4(val name: String, val age: Int)

fun main(){
    val a1 = User4("oybek", 29)
    //The toString() function returns a string representation of the object.
    println(a1.toString())
}