package enum

enum class CreditCardType1{
    SILVER, // ordinal 0 name="SILVER" enum constans
    GOLD,   // ordinal 1 name="GOLD"
    PLATINUM //ordinal 2 name="PLATINUM"
}
fun main(){
    val value: CreditCardType1 = CreditCardType1.GOLD
    println(CreditCardType1.GOLD.ordinal)
    println(CreditCardType1.GOLD)
    //each enum object has two methods: values() and valueOf()
    val myConstant:Array<CreditCardType1> = CreditCardType1.values()
    myConstant.forEach { println(it) }
}