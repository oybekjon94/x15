package constructor

class Car(var name: String)

fun main(){
    val car = Car("kia")
    println(car.name)
    val hyundai = Car("sonata")
    println(hyundai.name)
    val mercedes = Car("mercedes-benz")
    println(mercedes.name)
}