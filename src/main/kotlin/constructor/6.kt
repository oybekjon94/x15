package constructor

open class Person1(age: Int, name: String){
    init {
        println("my name is $name")
        println("my age is $age")
    }
}
class MathTeacher(age: Int,name: String):Person1(age,name){
    fun teachMaths(){
        println("I teach in primary school")
    }
}
class Footballeer(age: Int,name:String):Person1(age,name){
    fun playFoodbal(){
        println("I play footbal")
    }
}
fun main(args:Array<String>){
    val t1  = MathTeacher(28,"Oybek")
    t1.teachMaths()
    println()

    val f1 = Footballeer(29,"Sherbek")
    f1.playFoodbal()
    println()
}