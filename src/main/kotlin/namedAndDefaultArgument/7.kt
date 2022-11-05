package namedAndDefaultArgument

fun main(){
    information()  // you can output default argument
}
fun information(name: String = "oybek", age: Int = 29){
    println("my name is $name and my age is $age")
}