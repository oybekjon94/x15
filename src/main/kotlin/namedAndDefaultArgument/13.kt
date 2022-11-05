package namedAndDefaultArgument

//kotlin named argument
fun main(){
    run4(latter = 'a')
}
fun run4(num: Int=5,latter: Char='x'){
    print("parameter in function definition $num and $latter")
}