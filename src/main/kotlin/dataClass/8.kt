package dataClass

data class Product3(val varitem: String, var price: Int){
}
fun main(){
    val p1 = Product3("laptop", 25000)
    println("p1 object conntain data: $p1")
    val p2 = p1.copy()
    println("p2  copied object contains default data of p1: $p2")
    val p3 = p1.copy(price=20000)
    println("p3 contain altered data of p1: $p3")
}