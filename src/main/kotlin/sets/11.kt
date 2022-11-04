package sets

fun main(){
    val words = setOf<String>("pen","cup","dog",
    "person","cement","donkey")
    val w1 = words.first()
    println(w1)

    val w2 = words.last()
    println(w2)

    val w3 = words.findLast { w-> w.startsWith('d') }
    println(w3)

    val w4 = words.first {w->w.startsWith('d')}
    println(w4)

}