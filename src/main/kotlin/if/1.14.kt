package `if`

fun main(){
    val num1 = 10
    val num2 = 11
    val result = if (num1<=num2){
        println("num1 is equal or less than num2 ")
    }else if (num1==num2){
        println("num1 is equal to num2")
    }else{
        "num1 is less than num2"
    }
}