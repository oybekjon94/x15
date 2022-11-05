package namedAndDefaultArgument

fun main(){
    run()
}
fun run(num: Int = 5, latter: Char = 'x'){
    print("parameter in function definition $num and $latter")
}