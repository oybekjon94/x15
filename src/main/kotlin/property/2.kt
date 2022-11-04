package property

class Abs(
    val name: String,
    val ispassed: Boolean
)
fun main(){
    val abs = Abs("Bob", true)
    println(abs.name)
    println(abs.ispassed)
}