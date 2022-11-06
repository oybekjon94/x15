package dataClass

fun main(){
    //destructuring declarations
    val(n,l) = Player("astro",10)
    println(n)
    println(l)
}
data class Player(val nickname: String, val level: Int){

}