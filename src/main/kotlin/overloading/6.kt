package overloading

fun main(){
   println(getMax(11,12))
   println(getMax(11.3,12.4))
}
fun getMax(a: Int,b: Int) = if(a>b) a else b
fun getMax(a: Double,b: Double) = if(a>b) a else b