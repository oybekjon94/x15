package overloading

class DefaultTest {
    fun test(a: String, b: String? = null) {
        println("test1")
    }
    fun test(s: String,b: String, c:String? =null){
        println("test2")
    }
}
fun main(){
    val classA = DefaultTest()
    classA.test("a","b")
}