package namedAndDefaultArgument

fun main(){
    printName2()
}
fun printName2(name: String = getName()){
    println("hello "+name)
}
fun getName(): String{
    return "oybek"
}