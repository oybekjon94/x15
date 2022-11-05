package extension

class Circle (val radius: Double){
    fun area(): Double{
        return Math.PI*radius*radius
    }
}
fun main(){
    //Extension function created for a class Circle
    fun Circle.perimeter(): Double{
        return 2*Math.PI*radius
    }
    // create object for class function
    val newCircle = Circle(2.5)
    // invoke member function
    println("area of the circle is ${newCircle.area()}")
    // invoke extension function
    println("perimeter of the circle is ${newCircle.perimeter()}")

}