package nullable

fun main(){
    //variable is  declared as nullable
    var s2: String? = "GeeksforGeeks"

    s2 = null //no compiler error
    println(s2.length)  //compiler error because string can be null
}