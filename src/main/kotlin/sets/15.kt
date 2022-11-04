package sets

fun main(){
    val expenses = setOf(20,40,60,25)

    val cash = 550

    /*
    The folding operation is similar to the reduction.
    Folding is a terminal operation that aggregates set
     values into a single value. The difference is that
     folding starts with an initial value.
     */
    val result = expenses.fold(cash){
        total, next -> total - next
    }
    println(result)
}