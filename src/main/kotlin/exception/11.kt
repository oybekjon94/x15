package exception

fun main(args: Array<String>) {

    var amount = 600
    try {
        validateMinAmount(amount)
    } catch (e : Exception){
        println(e.message)
    }
}

fun validateMinAmount(amount : Int){
    throw Exception("Your balance $amount is less than minimum balance 1000.")
}