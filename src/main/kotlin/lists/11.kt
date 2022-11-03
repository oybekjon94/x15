package lists

fun main(){
    val names = listOf("oybek","sherbek","nurbek","otabek")
    for (name in names){
        println("$name - Number of characters : ${name.length}")
    }
}