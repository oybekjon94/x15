package constructor

class Phone(
    val name: String,
    val model: String,
    val color: String
){
    fun describe()=
        "Phone name is $name model is $model and color is $color"
}
fun main(){
    val iPhone =
        Phone("iPhone","iPhone Xs","white")
    println(iPhone.describe())
    val samsunc =
        Phone("galaxy S21","galaxy","black")
    println(samsunc.describe())
}