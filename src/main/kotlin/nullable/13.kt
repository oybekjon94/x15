package nullable

fun main(){
    //variable declared as nullable
    var s: String? = "GeeksForGeeks"
    println(s)
    if (s != null){
        println("String of length ${s.length}")
    }else{
        println("null string")
    }
    // assign null
    s = null
    println(s)
    if (s != null){
        println("String of length ${s.length}")
    }else{
        println("null string")
    }
}