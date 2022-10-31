package `while_do-while`

fun main(){
    var i = 1
    while (i < 9){
        if (i == 5){
            continue
        }
        println(i)
        i += 1
    }
}
/*
output
1
2
3
4
 */