package loopingAndRanges

fun findNumber(value: Int, number: List<Int>): Boolean{
    for (a in number){
        if (a==value){
            return true
        }
    }
    return false
}
fun main(){
    val number = listOf(1,2,3,4,5,6,8,9,10)
    val result =findNumber(11,number)
    println(result)
}