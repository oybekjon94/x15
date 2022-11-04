package sets

fun main(){
    val nums = setOf(4,5,2,3,4,2,1)

    //Reduction is a terminal operation that aggregates
    // set values into a single value.
    val sum = nums.reduce{total, next -> total+next}
    println(sum)
}