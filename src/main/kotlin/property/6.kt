package property

class Calculator(initialValue: Int = 0){
    var currentValue  = initialValue

    fun add(first: Int, second: Int): Int{
        println("$first + $second")
        currentValue = first + second
        return currentValue
    }

    fun substract(first: Int, second: Int): Int{
        println("$first - $second")
        currentValue = first - second
        return currentValue
    }
    fun multply(first: Int, second: Int): Int{
        println("$first * $second")
        currentValue = first * second
        return currentValue
    }
    fun divide(first: Int, second: Int): Int{
        println("$first / $second")
        currentValue = first / second
        return currentValue
    }
}

fun main(){
    val calculator = Calculator()
    calculator.add(12,23)
    println("Current  value: ${calculator.currentValue}")

    val calculator2 = Calculator()
    calculator2.multply(12,23)
    println("Current  value: ${calculator2.currentValue}")

    val calculator3 = Calculator()
    calculator3.substract(12,23)
    println("Current  value: ${calculator3.currentValue}")

    val calculator4 = Calculator()
    calculator4.divide(12,23)
    println("Current  value: ${calculator4.currentValue}")
}