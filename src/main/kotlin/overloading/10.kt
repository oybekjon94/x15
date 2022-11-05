package overloading

class Sum3
{
    fun add(num1: Int, num2: Int):Int
    {
        return (num1+num2)
    }
    fun add(num1: Double, num2: Double, num3:Double):Double
    {
        return (num1+num2+num3)
    }
    fun add(str1: String, str2: String, str3:String):String
    {
        return (str1+str2+str3)
    }

}
fun main(){
    var a = Sum3()
    println(a.add(23,23))
    println(a.add(23.3,23.4,23.4))
    println(a.add("oybek","sherbek","nurbek"))
}