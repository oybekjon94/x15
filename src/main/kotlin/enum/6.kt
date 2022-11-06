package enum

fun main(){
    val male = Gender2.MAN
    val stringValue = when(male){
        Gender2.MAN -> "gender is male"
        Gender2.FEMALE -> "gender is female"
    }
    println(stringValue)
}
class Person2(val name: String, val age: Int, val gender: Gender)
enum class Gender2(val definition: String){
    MAN("erkak"),
    FEMALE("ayol")
}