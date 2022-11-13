package `extension properties`

import java.time.LocalDate

fun LocalDate.getTomorrow() : LocalDate{
    return this.plusDays(1)
}

fun main(){
    val date = LocalDate.of(2022, 2, 15)
    println("today: ")
    println(date)

    println("\n---------\n")

    println("tomorrow:")
    println(date.getTomorrow())
}