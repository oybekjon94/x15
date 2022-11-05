package overloading

class B
{
    fun display(i: Int){
        println(1)
    }
    fun display(i: Long,b: Int){
        println(i+b)
    }
    fun display(i: Float,b: Int){
        println(i-b)
    }
    fun display(i: Double,b: Int){
        println(i/b)
    }
}
fun main(){
    val b = B()
    b.display(10)
    b.display(10L,4)
    b.display(10.1f,4)
    b.display(10.1,4)
}