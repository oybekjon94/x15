package extension

class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}
fun main(){
    val student = Student()
    val passingStatus = student.isPassed(55)
    println("student passing status is ${passingStatus}")

    val excellentStatuc = student.isExcellent(95)
    println("student excellent statuc is $excellentStatuc")
}