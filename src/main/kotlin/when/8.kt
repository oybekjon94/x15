package `when`

fun main(){
    print("enter name of the planet: ")
    var name = readLine()!!.toString()
    when(name){
        "mercury","earth","mars","jupiter",
            "neptune","venus" -> print("this is a planet")
        else -> print("this isn't a planet")
    }
}