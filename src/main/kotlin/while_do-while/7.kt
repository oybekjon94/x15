package `while_do-while`
fun main(){
    val university = arrayOf("Seoul National","Busan National","Inha")
    var index = 0
    while (index < university.size){
        println(university[index] + " University")
        index++
    }
}
/*
output
Seoul National University
Busan National University
Inha University
 */