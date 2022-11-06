package enum

import java.lang.instrument.ClassDefinition

fun main(){
    val p1 = Person("Ali",20,Gender.MAN)
    val p2 = Person("Alice",20,Gender.FEMALE)
    println("${p1.name}, ${p1.age}, ${p1.gender.definition}")
    println("${p2.name}, ${p2.age}, ${p2.gender.definition}")
}
class Person(val name: String, val age: Int, val gender: Gender)
enum class Gender(val definition: String){
    MAN("erkak"),
    FEMALE("ayol")
}