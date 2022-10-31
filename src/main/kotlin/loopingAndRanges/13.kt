package loopingAndRanges

fun main(){
    val list = listOf("oybek","sherbek","nurbek")
    for (name:String in list.reversed()){
        println(name)
    }
}
/*
output
nurbek
sherbek
oybek
 */