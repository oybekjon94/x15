package dataClass

data class User1(val name:String, val age:Int)

fun main(){
    val jack = User1("jack",24)
    println("name = ${jack.name}")
    println("name = ${jack.age}")
}