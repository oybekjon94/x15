package `extension properties`

fun Any?.toString(): String {
    println("Extension is called.")
    if (this == null) return "null"
    return toString()
}
fun main(args: Array<String>) {
    val var1 : Any? = null
    println(var1.toString())
    val str1 : String? = null
    println(str1.toString())
    var str2 : String? = "hello"
    println(str2.toString())
    var str3 : String? = "world"
    println(str3.toString())
}