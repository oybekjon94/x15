package constructor

//class with three secondary constructors
class Add2{
    constructor(a: Int,b:Int){
        var c = a+b
        println("Sum of 5,6 = ${c}")
    }
    constructor(a:Int, b:Int,c:Int){
        var d = a+b+c
        println("Sum of 5,6,7 = ${d}")
    }
    constructor(a: Int,b:Int,c:Int,d:Int){
        var e = a+b+c+d
        println("Sum of 5,6,7,8 = ${e}")
    }
}
//main function
fun main(){
    Add2(5,6)
    Add2(5,6,7)
    Add2(5,6,7,8)
}