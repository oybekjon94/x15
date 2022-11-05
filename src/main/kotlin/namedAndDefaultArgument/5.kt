package namedAndDefaultArgument

fun main(){
    show2("coders",25) // put argument here
    // and you can change default argument
}
fun show2(name: String = "code theraply", age: Int = 24){
    print("parameters of this function is $name and $age")
}