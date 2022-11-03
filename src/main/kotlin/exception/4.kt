package exception

fun main(){
    try{
        val number = "Test".toInt()
        println(number)
    }catch (e: NumberFormatException){
        println("Number format exception + $e")
    }

}