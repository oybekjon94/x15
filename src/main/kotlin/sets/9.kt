package sets


fun main(){
    val carSet = setOf<Car3>(
        Car3("BMW",120_000.0),
        Car3("Mers",150_000.0),
        Car3("Chevrolet",10_000.0))

    val result = carSet.filter { it.price>50_000 }
    result.forEach { println(it) }

}
data class Car3(val name: String, val price: Double)