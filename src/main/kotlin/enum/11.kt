package enum

enum class CreditCardType2{
    SILVER, // ordinal 0 name="SILVER" enum constans
    GOLD,   // ordinal 1 name="GOLD"
    PLATINUM //ordinal 2 name="PLATINUM"
}
fun main(){
    val peterCardType: CreditCardType2 = CreditCardType2.GOLD
    println(CreditCardType2.GOLD.ordinal)
    println(CreditCardType2.GOLD)
    val myConstant:Array<CreditCardType2> = CreditCardType2.values()
    myConstant.forEach { println(it) }
    //using in when statement
    when(peterCardType){
        CreditCardType2.SILVER -> println("peter has silver card")
        CreditCardType2.GOLD -> println("peter has gold card")
        CreditCardType2.PLATINUM -> println("peter has platinum card")
    }
}