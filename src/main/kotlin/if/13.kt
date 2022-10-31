package `if`

fun main(){
    val num1 = 15
    val num2 = 16
    val result = if (num1<=num2){
        println("$num1 is greater than $num2")
    }else{
        println("$num1 is smaller than $num2")
    }
    println(result)
}