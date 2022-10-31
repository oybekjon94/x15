package `while_do-while`

fun main(){
    var i = 0
    do {
        println(i)
        i++
        var j = 0
        while (j < 5){
            println("---$j")
            j++
        }
    }while (i < 3)
}
/*
output
0
---0
---1
---2
---3
---4
1
---0
---1
---2
---3
---4
2
---0
---1
---2
---3
---4
 */