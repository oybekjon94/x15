package sets

fun main(){
   val carSet = setOf<Car>(
       Car("BMW",120_000.0),
       Car("Mers",150_000.0),
       Car("Chevrolet",10_000.0))

    val sortedCarSet = carSet.sortedBy { it.price }

    sortedCarSet.forEach {car->
        println(car)
    }
    //sortedByDescending
    val sortedCarSet2 = carSet.sortedByDescending { it.price }

    sortedCarSet2.forEach { car ->
        println(car)
    }
}
data class Car(val name: String, val price: Double)