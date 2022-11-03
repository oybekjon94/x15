package exception

fun main(){
    try {
        val myVar: Int = 12
        val v: String  = "Tutroialspoint.com"
        v.toInt()
    }catch (e: Exception){
        e.printStackTrace()
    }finally {
        println("Exception Handeling in Kotlin")
    }
}