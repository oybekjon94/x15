package loopingAndRanges

fun main(){
    val people = listOf(
        Person("oybek"),
        Person("sherbek"),
        Person("nurbek")
    )

    for (i in people){
        println(i)
    }
}
data class Person(val name: String)