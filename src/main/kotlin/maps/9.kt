package maps

fun main(){
    val ranks = mapOf(1 to "India",2 to "Australia",
    3 to "England", 4 to "Africa")
    //method1
    println("the size of the map is: "+ranks.size)
    //method2
    println("the size of the map is: "+ranks.count())
}