package enum

enum class Direction1{
    NORTH, SOUTH, WEST, EAST // it's is 0bject
}
enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0xFFF00)
}
fun main(){
    val d1: Direction1 = Direction1.EAST // .ordinal
    println("d1 = $d1")

    val cr1 : Color = Color.RED
    println("cr1.toString() = ${cr1.toString()}")
    println("cr1.rgb = ${cr1.rgb}")
    println("cr1.rgb = ox${cr1.rgb.toString(16).toUpperCase()}")
    println("cr1.name = ${cr1.name}")
    println("cr1.ordinal = ${cr1.ordinal}")
}