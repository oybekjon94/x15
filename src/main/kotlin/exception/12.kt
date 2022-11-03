package exception

fun main(){
    try {
        var num = 10 / 0
    }
    catch (e: ArithmeticException){
        //caught and handles it
        println("Divide by zero not allowed")
    }
}