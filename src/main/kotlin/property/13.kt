package property

import constructor.Add

class Address
{
    var name: String = "tashkent"
    var street: String = "Navoiy"
    var city: String = "tashkent"
}
fun main(){
    val address = Address()
    println("my address is ${address.name}, my street is ${address.street} and ${address.city}")
}