package `when`

//A large part of computer programming is performing an action when a
//pattern matches.
fun main(){
    val tempurature = 48

    val reaction = when{
        tempurature > 55 -> "it's too hot"
        tempurature > 40 -> "it's too cold"
        else             -> "it's just right"
    }
    println(reaction)
}