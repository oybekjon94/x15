package property

//Custom implementation of property accessor.
class Rectangle (val height:Int, val width: Int)
{
    /*
    The property isSquare needs no field to store
    the value. It only has a custom getter with the
    implementation provided. Every time the property
    is accessed, the value is computed.
     */
    val isSquare: Boolean
    get(){
        return height == width
    }
}
fun main(){
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}