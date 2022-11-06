package enum

fun main(){
    val day = DAYS.SATURDAY
    println(DAYS.isWeekend(day))
}
enum class DAYS(val isWeekend:  Boolean = false){
    Monday(true),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY(true);
    companion object{
        fun isWeekend(days: DAYS) = days.name == SUNDAY.name || days.name == SATURDAY.name
    }
}