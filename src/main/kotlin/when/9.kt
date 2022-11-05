package `when`

fun main(){
    print("enter your's car: ")
    var cars = readLine()!!.toString()
    when(cars){
        "tiko","damas","nexia","malibu" -> print("this is your car")
        else -> print("this isn't your car")
    }
}