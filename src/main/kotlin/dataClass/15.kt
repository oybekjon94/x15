package dataClass

data class User6(val name: String, val age: Int, val gender: String)

fun main() {
    val a1 = User6("oybek", 29,"male")

    //This was possible because the compiler generates componentN()
   // functions all properties for a data class.
    println(a1.component1())
    println(a1.component2())
    println(a1.component3())
}