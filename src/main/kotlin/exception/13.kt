package exception

fun test(a: Int, b: Int): Any{
    return try {
        a/b
        //println("The result is: "+a/b
    }
    catch (e: Exception){
        println(e)
        "Divide by zero not allowe"
    }
}
fun main(){
    var result1 = test(10,2) //execute try block
    println(result1)
    var result = test(10,0)  //execute catch block
    println(result)
}