package `when`

fun main(){
    val tempurature = -5

    val reaction = when{
        tempurature > 55 -> "it's too hot"
        tempurature < 40 -> "it's too cold"
        tempurature < 0  -> "it's frigid"
        else             -> "it's just right"
    }
    println(reaction)
}