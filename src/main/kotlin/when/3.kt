package `when`

fun main(){
    val age = 40
    when{
        age in 0..1 ->{
            println("baby")
        }
        age in 1..15 -> {
            println("young boy")
        }
        age in 15..20 ->{
            println("tenager")
        }
        age in 20..40 ->{
            println("older")
        }
    }
}