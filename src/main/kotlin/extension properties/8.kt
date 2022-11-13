package `extension properties`

import java.time.LocalDate
import java.time.format.DateTimeFormatter

val LocalDate.americanFormatString : String
get() = this.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")).toString()

val LocalDate.europeanFormatString : String
    get() = this.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString()

fun main(){
    val date = LocalDate.of(2022, 2, 15)

    println("American format:")
    println(date.americanFormatString)

    println("\n-------\n")

    println("europen format")
    println(date.europeanFormatString)
}