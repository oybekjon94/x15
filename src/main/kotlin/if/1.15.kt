package `if`

fun main(){
    val a:String = "interesting"
    val b:String = "not interesting"
    val book = if (a<=b){
        println("this book not interesting")
    }else{
        println("this book very interesting")
    }
    println(book)
}