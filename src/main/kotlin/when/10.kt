package `when`

fun main(){
    print("enter the month number of year: ")
    var num = readLine()!!.toInt()
    when(num){
        in 1..3 -> print("Spring season")
        in 4..6 -> print("Summer season")
        in 7..8 -> print("Rainly season")
        in 9..10 -> print("Autumn season")
        in 11..12 -> print("winter season")
        !in 1 ..12 -> print("enter valid month of year")
    }
}