package exception

fun main(){
    try {
        //null value
        val name: String? = null
        println(name!![0])
    }catch (e: NullPointerException){
        println("Cause exception $e")
    }
}