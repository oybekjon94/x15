package lists

fun main(){
    var name = mutableListOf<String>("oybek","sherbek")
    name.add("nurbek")
    name.add("otabek")
    for (i in 0..name.size - 1){
        println(name.get(i))
    }
}