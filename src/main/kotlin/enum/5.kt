package enum

fun main(){
    for (gender in Gender1.values()){
        println("${gender.ordinal}, ${gender.name}, ${gender.definition}")
    }
}

class Person1(val name: String, val age: Int, val gender: Gender)
enum class Gender1(val definition: String){
    MAN("erkak"),
    FEMALE("ayol")
}