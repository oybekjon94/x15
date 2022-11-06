package enum

enum class Weekdays2(val kr: String){
    SUN("일"),MON("월"),TUE("화"),WED("수"),THU("목"),FRI("금"),SAT("토")
}
fun main(){
    val weekdays2: Weekdays2 = Weekdays2.FRI
    println("weekdays2 => ${weekdays2.name}")
    println("weekdays2 => ${weekdays2.kr}")
    println("weekdays2 => ${weekdays2.ordinal}")

    val weekdays3: Weekdays2 = Weekdays2.SUN
    println("weekdays = ${weekdays3.name}")
    println("weekdays = ${weekdays3.kr}")
    println("weekdays = ${weekdays3.ordinal}")
}
