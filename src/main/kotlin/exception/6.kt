package exception

fun main(){
    val string: Any = "11"
    try {
        val resultValue = string as Int
        println(resultValue)
    }catch (e: ClassCastException){
        println("Caused exception $e")
    }

}