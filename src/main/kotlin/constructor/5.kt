package constructor

class Person(name: String){
    val greeting = "Rich $name"
}
fun main(){
    val person = Person("Oybek Kholikov")
    println(person.greeting)
}