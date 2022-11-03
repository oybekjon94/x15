package lists

fun main(){
    val entrees = mutableListOf<String>()
    val moreItems = listOf("oybek","sherbek","nurbek")
    println("Add lists: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    // clear out the list
    entrees.clear()
    println("Entrees: $entrees")
    // check if the list is empty
    println("Empty? ${entrees.isEmpty()}")
}