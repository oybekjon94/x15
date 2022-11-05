package `when`

fun main(){
    print("enter the name of heavenly body: ")
    var name = readLine()!!.toString()
    when(name){
        "sun" -> print("sun is a star")
        "moon"-> print("moon is a satellite")
        "earth"-> print("earth is a panet")
        else -> print("I don't know anything about it")
    }
}