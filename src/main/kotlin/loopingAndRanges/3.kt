package loopingAndRanges

fun main(){
    val values = 1..10
    for (v in values){
        println("$v")
    }
    val v = 5
    if (v in values)
        println("$v is a member of $values")
}
/*
output
1
2
3
4
5
6
7
8
9
10
5 is a member of 1..10
 */