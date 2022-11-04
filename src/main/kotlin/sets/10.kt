package sets

fun main(){
    val carSet = setOf<Car4>(
        Car4("BMW",120_000.0),
        Car4("Mers",150_000.0),
        Car4("Chevrolet",10_000.0))

    val result = carSet.maxByOrNull { it.price}
    println(result)
}
data class Car4(val name: String, val price: Double)