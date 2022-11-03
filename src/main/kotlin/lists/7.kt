package lists

fun main(){
    val entrees = mutableListOf<String>()
    val moreItems = listOf("oybek","sherbek","nurbek")
    println("Add lists: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    println("Remove name: ${entrees.remove("nurbek")}")
    println("Entrees: $entrees")
    println("Remove last element: ${entrees.removeAt(1)}")
    println("Entrees: $entrees")
}