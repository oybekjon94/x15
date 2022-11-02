package constructor

class Car3{
    var brand = ""
    var model = ""
    var year = 0
}
fun main(){

    val c1 = Car3()
    c1.brand = "Sonata"
    c1.model = "Hyundai"
    c1.year = 2020

    println(c1.brand)
    println(c1.model)
    println(c1.year)

}