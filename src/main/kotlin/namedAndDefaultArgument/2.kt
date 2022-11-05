package namedAndDefaultArgument

fun main(){
    printName()
}
// this default argument
fun printName(name: String = "Anonymous"){
    println("hello "+ name)
}