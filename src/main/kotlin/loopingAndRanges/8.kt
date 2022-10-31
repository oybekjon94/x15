package loopingAndRanges

fun hasString(s: String, b: Char): Int{
    for (a in s ) {
        if (a == b) return 1
    }
    return 2
}
fun main(){
    println(hasString("oybek", '7'))
    println(hasString("246861", '1'))
}