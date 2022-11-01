package constructor

class Student{
   var name: String
   val age: Int

   init {
       name = "Anupam"
       age = 24
   }
    init {
        name = "Anupam Chugh"
    }
}

fun main(){
    val student = Student()
    println("${student.name} age is ${student.age}")
    student.name = "Your"
    println("${student.name} age is ${student.age}")
}