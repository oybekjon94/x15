package namedAndDefaultArgument

fun main(){
    printInfo("Max",25) //named Argument
    printInfo("Max")
    printInfo() // default Argument
}
fun printInfo(name:String = "XYZ", age:Int = 18){
    println("My name is $name and I am $age")
}