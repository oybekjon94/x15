package nullable

fun main(){
    //variable is  declared as nullable
    var s2: String? = "GeeksforGeeks"

    s2 = null //no compiler error
    println(s2)  //compiler error because string can be null
}