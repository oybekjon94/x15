package constructor

class MyClass(val name: String, var id: Int){
}
fun main(){
    val myClass = MyClass("Jon",123456)

    println("Name = ${myClass.name}")
    println("Id = ${myClass.id}")
}