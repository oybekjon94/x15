package `while_do-while`
//A while loop continues as long as the controlling
// Boolean-expression produces true:
fun testCondition(i: Int) = i < 100
fun main(){
    var i = 0
    while (testCondition(i)){
        print(".")
        i += 10
    }
}