package namedAndDefaultArgument

fun main(){
    printMessageWithPrefix("hello, kotlin")
    printMessageWithPrefix("hello, kotlin","warn")
}
fun printMessageWithPrefix(message: String, prefix: String = "Info"): Unit{
    println("[$prefix] $message")
}