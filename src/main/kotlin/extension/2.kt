package extension

class School(val name: String){
    fun open(){
        println("school is opening at 9:00")
    }
    fun close(){
        println("school is close at 17:00")
    }
}
fun main(){
    val schoolTime = School("tashkent")
    schoolTime.open()
    schoolTime.close()
    schoolTime.breakTime()
}
fun School.breakTime(){
    println("a break time is at 12:00")
}