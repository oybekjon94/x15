package maps

fun main(){
    val ranks = mapOf(1 to "India",2 to "Australia",
        3 to "England", 4 to "Africa")
    //get values of map
    //method1
    println("team having rank #1 is "+ranks[1])
    //method2
    println("team having rank #3 is "+ranks.getValue(3))
    //method3
    println("team having rank #4 is "+ranks.getOrDefault(4,0))
    //method4
    val team = ranks.getOrElse(2, {0})
    println(team)
}