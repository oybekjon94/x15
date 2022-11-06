package dataClass

data class User(var name: String, var id:Int, var email: String){

}
fun main(){
    val u = User("oybek",1111,"mymail@mail.com")
    print(u)
}