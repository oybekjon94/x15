package dataClass

data class User5(val name: String, val age: Int)

fun main(){
    val a1 = User5("oybek", 29)
    val a2 = a1.copy()
    val a3 = a1.copy(name = "doston")

    //Returns a hash code value for the object.
    println("a1 hashcode = ${a1.hashCode()}")
    println("a2 hashcode = ${a2.hashCode()}")
    println("a3 hashcode = ${a3.hashCode()}")

    if (a1.equals(a2) == true)
        println("a1 is equal to a2")
    else
        println("a1 is not equal to a2")
    if (a1.equals(a3) == true)
        println("a1 is equal to a3")
    else
        println("a1 is not equal to a3")
}