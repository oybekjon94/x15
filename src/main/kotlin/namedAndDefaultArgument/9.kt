package namedAndDefaultArgument

fun main(){
    val student = student("behzod")
    println(student)
    student()
}
fun student(name: String = "oybek", age : Int = 29){
    println("name of the student is : $name")
    println("age of the student is : $age")
}
