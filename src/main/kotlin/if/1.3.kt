package `if`

fun main(){
    val open = 9
    val close = 18
    if (open < 10){
        println("the market is opening")
    }else
        println("the market is closing")
    if (close < 15){
        println("the market is not closed yet ")
    }else
        println("the market is closing now ")
}