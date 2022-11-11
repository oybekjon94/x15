package nullable

fun main(){
    //variable declared as nullable
    var firstName: String? = "Praveen"
    var lastName: String? = null

    println(firstName?.toUpperCase())
    println(firstName?.length)
    println(lastName?.toUpperCase())
}