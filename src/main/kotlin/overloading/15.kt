package overloading

fun main(){
    userInfo1("oybek")
    userInfo1("doston", 28,1994)
    userInfo1("behzod",34,"black")
}
fun userInfo1(name: String){
    println("name : $name")
}
fun userInfo1(name: String, age: Int, birth: Int){
    println("name : $name, Age: $age, and birth is $birth")
}
fun userInfo1(name: String,age: Int,favColor: String){
    println("name : $name, Age: $age, favorite color: $favColor")
}