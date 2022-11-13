package `extension properties`

class FooClass{
    //defining an empty companion object
    companion object{}
}
fun FooClass.Companion.sayHello(){
    println("hello world")
}

fun main(){
    FooClass.sayHello() // this is just like writing FooClass.Companion.sayHello()
}