package extension

class MyClass{
    companion object{
        //member function of companion object
        fun display(str: String): String{
            return str
        }
    }
}
//extension function of companion object
fun MyClass.Companion.abc(){
    println("extension function of companion object")
}
fun main(){
    val ob = MyClass.display("function declared in companion object")
    println(ob)
    //invoking the extension function
    val ob2 = MyClass.abc()
}