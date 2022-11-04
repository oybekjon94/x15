package maps

fun main(){
    val menu = mutableMapOf("Shashlik" to 15000,
    "somsa" to 5000,
    "osh" to 10000)

    //add and change the value
    println(menu)
    menu.put("non", 2000)
    println(menu)
    menu["Shashlik"] = 18000
    println(menu)
}