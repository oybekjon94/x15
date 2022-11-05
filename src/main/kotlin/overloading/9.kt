package overloading

class Sum2
{
    fun add(num1: Int, num2: Int):Int
    {
        return (num1+num2)
    }
    fun add(num1: Int, num2: Int, num3:Int):Int
    {
        return (num1+num2+num3)
    }
    fun add(str1: String, str2: String, str3:String):String
    {
        return (str1+str2+str3)
    }

}
fun main(){
    var a = Sum2()
    println(a.add(23,23))
    println(a.add(23,23,23))
    println(a.add("oybek","sherbek","nurbek"))
}