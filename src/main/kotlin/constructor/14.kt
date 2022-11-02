package constructor

class Person3(_firstname: String = "UNKNOWN", _age: Int = 0){
    val firstname = _firstname.capitalize()
    var age = _age

    init {
        println("Frist Name = $firstname")
        println("Age = $age\n")
    }
}
fun main(){
    println("person1 is instantied")
    val person1 = Person3("joe",25)

    println("person2 is instantied")
    val person2 = Person3("jack")

    println("person3 is instantied")
    val person3 = Person3()
}