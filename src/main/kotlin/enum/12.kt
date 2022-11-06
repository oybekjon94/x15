package enum

enum class CreditCardType3(val color: String, val maxLimit: Int = 100000){
    SILVER("gray",50000), // ordinal 0 name="SILVER" enum constans
    GOLD("gold"),   // ordinal 1 name="GOLD"
    PLATINUM("black") //ordinal 2 name="PLATINUM"
}
fun main(){
    println(CreditCardType3.SILVER.color)
    println(CreditCardType3.SILVER.maxLimit)
}