package nullable

fun main(){
    var str:String? = "hello" //variable is declared as nullable
    var len = if (str!=null)str.length else -1
    println("str is : $str")
    println("str length is : $len")

    str  = null
    println("str is $str")
    len = if (str != null)str.length else -1
    println("b length is : $len")
}