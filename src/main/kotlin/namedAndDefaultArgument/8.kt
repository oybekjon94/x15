package namedAndDefaultArgument

fun main(){
    printUserInfo(firstName = "nurbek", age = 32)
    printUserInfo(firstName = "sherbel", age = 30)
    printUserInfo(firstName = "oybek" )

}
fun printUserInfo(firstName: String, lastName: String = "kholikov",age: Int = 29){
    println("$firstName $lastName is of age $age")
}