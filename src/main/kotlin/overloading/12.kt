package overloading

fun main(){
    addition3(4,4)
    addition3(4.1f,4.3f)
    addition3(4.1,4.3)
}
fun addition3(num1: Int, num2: Int){
    val sum = num1 + num2
    println(sum)
}
fun addition3(num1: Float, num2: Float){
    val sum = num1 + num2
    println(sum)
}
fun addition3(num1: Double, num2: Double){
    val sum = num1 + num2
    println(sum)
}
