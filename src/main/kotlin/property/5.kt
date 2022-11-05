package property

class Car(var name: String, var color: String, var age: Int) {
    fun printCar() {
        println("my car's $name and my car's color is $color and age is $age")
    }
}
    fun main(){
        val myCar = Car("Kia","white",10)
        println(myCar.printCar())
    }

