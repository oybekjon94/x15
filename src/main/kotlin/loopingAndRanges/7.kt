package loopingAndRanges

fun hasChar(s: String, ch: Char): Boolean
{
    for (c in s){
        if (c == ch) return true
    }
    return false
}
fun main(){
    println(hasChar("oybek",'e'))
    println(hasChar("sherbek", 't'))
}
/*
output
true
false
 */