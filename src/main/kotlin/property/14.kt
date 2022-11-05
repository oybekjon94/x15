package property

import kotlin.properties.Delegates

class User2{
    var name: String by Delegates.observable("<no name>"){
       prop, old, new ->
       println("$old -> $new")
    }
}
fun main(){
    val user = User2()
    user.name = "first"
    user.name = "second"
}