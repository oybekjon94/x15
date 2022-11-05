package overloading

fun main(){
    addition4(4,4.1)
    addition4(4.1f,4.3)
}
fun addition4(num1: Int, num2: Double){
    val sum = num1 + num2
    println(sum)
}
fun addition4(num1: Float, num2: Double){
    val sum = num1 + num2
    println(sum)
}