package overloading

import namedAndDefaultArgument.printUserInfo

fun main(){
    userInfo("oybek")
    userInfo("doston", 37)
    userInfo("behzod",34,"black")
}
fun userInfo(name: String){
    println("name : $name")
}
fun userInfo(name: String, age: Int){
    println("name : $name, Age: $age")
}
fun userInfo(name: String,age: Int,favColor: String){
    println("name : $name, Age: $age, favorite color: $favColor")
}