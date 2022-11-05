package `when`

fun main(){
    print("enter of the number your car: ")
    var cars = readLine()!!.toInt()
    var car = when(cars){
        1->"tiko"
        2->"nexia"
        3->"damas"
        4->"malibu"
        else->"this isn't your car"
    }
    print(car)
}