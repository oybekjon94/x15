package property

class Rectangle2(val height: Int, val width: Int)
{
    val isSquare: Boolean
    get(){
        return height <= width
    }
}
fun main(){
    val rectangle = Rectangle2(41,42)
    println(rectangle.isSquare)
}