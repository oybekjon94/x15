package namedAndDefaultArgument

//named argument
//If you write the name of the argument together, you can put the argument in any order.
fun printMessageWithPrefix2(message: String, prefix: String = "info"): Unit{
    println("[$prefix] $message")
}
fun main(){
    printMessageWithPrefix2("hello","info")
    printMessageWithPrefix2(prefix = "warn", message = "hello")
}