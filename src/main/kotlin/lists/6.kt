package lists

fun main(){
    val entrees = mutableListOf<String>()
    val moreItems = listOf("oybek","sherbek","nurbek")
    println("Add lists: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    println("Add lists: ${entrees.add("otabek")}")
    println("Entrees: $entrees")
}