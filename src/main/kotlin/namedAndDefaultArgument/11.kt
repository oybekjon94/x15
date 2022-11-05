package namedAndDefaultArgument

fun main(){
    //passing some argument in function call
    run2(3)
}
fun run2(num: Int = 5, latter: Char = 'x'){
    print("parameter in function definition $num and $latter")
}