package exception

fun main(){
    val list = listOf(1,2,3)
    try {
        println(list[4])
    }catch (e: ArrayIndexOutOfBoundsException){
        println(e)
    }
}