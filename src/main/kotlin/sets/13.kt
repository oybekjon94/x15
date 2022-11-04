package sets

fun main(){
    val nums = setOf<Int>(1,2,3,4,5,6)

    //The mapping operation returns a modified list by
    // applying a transform function on each element of the set.
    val nums2 = nums.map { e->e*2 }
    println(nums2)
}