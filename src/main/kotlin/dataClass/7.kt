package dataClass

import atomictest.eq

data class Product2(val varitem: String, var piece: Int){

}
fun main(){
    val p = Product2("laptop", 25000)
    val p1 = Product2("laptop", 25000)
    println(p == p1)
    println(p1.eq(p1))
}