package extension

/*
Extension functions -> Suppose you discover a library that does everything you need … almost. If
it only had one or two additional member functions, it would solve your
problem perfectly
 */
fun main(){
    val car = Car("captiva")
    car.start()
    car.stop()
    car.park()
}
fun Car.park(){
    println("the car is parking")
}
class Car(val name: String){
    fun start(){
        println("the car is starting")
    }
    fun stop(){
        println("the car is stopping")
    }
}