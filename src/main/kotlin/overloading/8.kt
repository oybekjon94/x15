package overloading

class Sum
{
    fun add(num1: Int, num2: Int):Int
    {
        return (num1+num2)
    }
    fun add(num1: Int, num2: Int, num3:Int):Int
    {
        return (num1+num2+num3)
    }
}
fun main(){
    var a = Sum()
    println(a.add(23,23))
    println(a.add(23,23,23))
}