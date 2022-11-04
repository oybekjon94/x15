package maps

fun main(){
    val name = mutableMapOf(1 to "kholikov",2  to "oybek")
    name.put(3, "sherbek")
    name.put(4, "nurbek")
    for (i in name.keys){
        println(name.get(i))
    }

    for (i in name){
        println(name)
    }
}