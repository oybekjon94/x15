package `if`

fun main(){
    val battery = 100
    if (battery > 90){
        println("the battery charge is 100 percent ")
    }else if (battery < 80){
        println("battery charge is 80 percent")
    }else
        println("battery charge is 0 percent ")
}