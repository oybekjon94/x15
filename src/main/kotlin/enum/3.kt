package enum

data class Mobile (val name: String, val color: MobileColor)
enum class MobileColor(val value: Int){
    GOLD(0xffd323),
    SILVER(0xeaeaea),
    WHITE(0xffffff),
    BLACK(0x000000),
    RED(0xFF0000)
}
fun main(){
    val mobile1: Mobile = Mobile("Iphone",MobileColor.GOLD)
    val mobile2: Mobile = Mobile("Sony",MobileColor.BLACK)

    // access enum variables
    println("the color of my "+mobile1.name+" is "+mobile1.color)
    println("the color of my "+mobile2.name+" is "+mobile2.color)
    // access the value of the variable in Enum Object
    println(mobile1.color.toString()+"value is "+mobile1.color.value)
    println(mobile2.color.toString()+"value is "+mobile2.color.value)
}