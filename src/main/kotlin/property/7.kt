package property

class Car2(
    var name: String,
    var color: String
)
fun main(){
    var car = Car2("matiz","red")
    println(car.name)
    println(car.color)

    car = Car2("tiko","black")
    println(car.name)
    println(car.color)
}