package `when`

fun main(){
    print("enter your friend name: ")
    var friends = readLine()!!.toString()
    var friend = when(friends){
        "Utkir" -> print("Utkir is your friend")
        "Abbos" -> print("Abbos is your friend")
        "Kamol" -> print("Kamol is your friend")
        "Bilol" -> print("Bilol is your friend")
        else -> print("he isn't your friend")
    }
    print(friend)
}