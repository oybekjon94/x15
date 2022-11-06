package dataClass

data class User2(val name: String, val age: Int = 29)
fun main(){
    val a1 = User2("oybek")
    val a2 = User2("doston")
    val a3 = User2("abbos",30)
    println("${a1}")
    println("${a2}")
    println("${a3}")
}