package enum

enum class CreditCardType{
    SILVER, // ordinal 0 name="SILVER" enum constans
    GOLD,   // ordinal 1 name="GOLD"
    PLATINUM //ordinal 2 name="PLATINUM"
}
fun main(){
    //enum constants are objects of enum class type
    val value: CreditCardType = CreditCardType.GOLD
    //each enum object has two properties: ordinal and name
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD.name) // you can write without name properties
}