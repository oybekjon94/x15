package sets

fun main(){
    val carSet = setOf<Car2>(
        Car2("BMW",120_000.0),
        Car2("Mers",150_000.0),
        Car2("Chevrolet",10_000.0))

    val carChevrolet = Car2("Chevrolet",10_000.0)
    println(carSet.contains(carChevrolet))

}
data class Car2(val name: String, val price: Double)