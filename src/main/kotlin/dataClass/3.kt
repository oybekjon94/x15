package dataClass

fun main(){
    val person1 = Person2("oybek",28)
    val person2 = Person2("doston",30)
    val person3 = Person2("utkir",33)
    val person4 = Person2("kamol",28)
    println(person1.toString())
    println(person2.toString())
    println(person3.toString())
    println(person4.toString())

}
data class Person2(val name: String, val age:Int){

}