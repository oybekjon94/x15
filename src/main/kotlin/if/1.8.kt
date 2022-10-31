package `if`

fun main(){
    var x: Int
    x = if (10<20){
        if (4 == 3){
            56
        }else{
           96
        }
    }else if (12 > 13){
        26
    }else{
        27
    }
    println("$x")
}