package `while_do-while`

fun main(){
    var i = 1
    do {
        println(i)
        if (i == 5)
            break
            i++
    }while (i < 9)
}
/*
output
1
2
3
4
5
 */