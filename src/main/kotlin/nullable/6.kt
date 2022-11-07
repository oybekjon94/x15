package nullable

fun main(){
    var a: String? = null
    println(a?.toUpperCase())  //?. null safe operator
    println(a?:"default".toUpperCase()) //?: elvis operator
    println(a!!.toUpperCase())   //!!.non-null assertion operator
}
