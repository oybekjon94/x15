package constructor

class Car4{
    val id: String
    val type: String

    constructor(id: String, type: String){
        this.id = id
        this.type = type
    }
}
fun main(){
    val car = Car4("1","sport")
    val suvCar = Car4("2","suvCar")
    println("${car.id}->${car.type}")
    println("${suvCar.id}->${suvCar.type}")
}