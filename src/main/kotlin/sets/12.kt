package sets

fun main(){
    val nums = setOf<Int>(1,2,3)
    val nums2 = setOf<Int>(4,5,6)

    //The union operation returns a set
    // containing all distinct elements from both collections.
    val nums3 = nums.union(nums2)

    println(nums3)
}