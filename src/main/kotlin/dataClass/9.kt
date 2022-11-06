package dataClass

data class Product4(val item: String= "laptop", var price: Int = 25000){

}
fun main(){
    val p1 = Product4(price = 20000)
    println(p1)
}