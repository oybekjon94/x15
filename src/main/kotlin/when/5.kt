package `when`

fun main(){
    print("enter number of the month: ")
    var monthOfYear = readLine()!!.toInt()
    var month = when(monthOfYear){
        1->"january"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else->"not a month of year"
    }
    print(month)
}