package lists

fun main(){
    val numbers = listOf(1,2,3,4,5,6)
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
}