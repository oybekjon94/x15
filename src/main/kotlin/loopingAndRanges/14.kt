package loopingAndRanges

fun main(){
    val list = listOf("oybek","sherbek","nurbek")
    for (name:String in list.dropLast(1)){
        println(name)
    }
}
/*
output
oybek
sherbek
 */