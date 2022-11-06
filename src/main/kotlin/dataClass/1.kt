package dataClass

import atomictest.eq

//You define a data class using the data keyword, which tells Kotlin to generate
//additional functionality. Each constructor parameter must be preceded by var or
//val:
data class Simple(
    val arg1: String,
    val arg2: Int
)
fun main(){
    val a1 = Simple("hi",29)
    val a2 = Simple("hi",29)
    a1 eq "Simple(arg1=hi, arg2=30)"
    a1 eq a2
}