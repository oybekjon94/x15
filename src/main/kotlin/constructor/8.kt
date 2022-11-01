package constructor

class Add(a: Int, b:Int){
    var c = a+b
}
fun main(){
    val add = Add(5,6)
    println("The Sum of numbers 5 and 6 is: ${add.c}" )
}