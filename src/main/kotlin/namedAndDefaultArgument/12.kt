package namedAndDefaultArgument

fun main(args: Array<String>) {
    //passing all argument in function call
    run3(3,'a')
}
fun run3(num:Int= 5, latter: Char ='x') {
    print("parameter in function definition $num and $latter")
}