package generic

//generics
fun main(){
    val array = Array<String>(2){i->1.toString()}
    val array1 = Array<Int>(2){i->1}
    println(array.size)
    println(array1.size)

}
class Person<T>(val data: T){
    fun getValue():T {
        return data
    }
}