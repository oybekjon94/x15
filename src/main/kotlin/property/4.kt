package property

class User(var firstName: String, var lastName: String){
    var fullName = "$firstName $lastName"
    init {
        println("In Init block")
        println("This is the class for user $fullName")
    }
}
fun main(){
    val user = User("Oybek","Kholikov")
    println(user.fullName)

    user.fullName = "hello world"
    println(user.fullName)
}
