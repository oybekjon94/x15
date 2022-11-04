package property

/*
To read a property, use its name. To assign a value to a mutable property,
use the assignment operator =.
 */
class Person(){
    val name = "chacha"
    var age = 10
}
fun main(){
    val person = Person()
    println(person.name)
    println(person.age)
}