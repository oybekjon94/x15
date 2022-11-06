package dataClass

fun main(){
    val person1 = Person("oybek",28)
    val person2 = Person("oybek",28)
    println(person1 == person2)
}
data class Person(val name: String, val age:Int){

}