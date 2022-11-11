package generic

class Person1<T>(age: T){
    var age: T = age
    init {
        this.age = age
        println(age)
    }
}
fun main(){
    var ageInt:Person1<Int> = Person1<Int>(30)
    var ageString:Person1<String> = Person1<String>("30")
}