package overloading

fun main(){
    addition2(4,4)
    addition2(4.1f,4.3f)
}
fun addition2(num1: Int, num2: Int){
    val sum = num1 + num2
    println(sum)
}
fun addition2(num1: Float, num2: Float){
    val sum = num1 + num2
    println(sum)
}
