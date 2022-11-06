package dataClass

data class Product(val varitem: String, var piece: Int){

}
fun main(){
    val p = Product("laptop", 25000)
        println(p)
}