package nullable

// null safe operator
fun printAllCaps(s: String?){
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}
fun main(){
    printAllCaps("abs")
    printAllCaps(null)
}