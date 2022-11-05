package namedAndDefaultArgument

fun main(){
    show() // put argument here
           // and you can change default argument
}
fun show(name: String = "code theraply", age: Int = 24){
    print("parameters of this function is $name and $age")
}