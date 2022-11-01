package constructor

class Cars(
    val name: String,
    val model: String,
    val doors: Int,
){
    fun describe()=
        "Car name is $name model $model and doors have $doors"
}
fun main(){
    val lacetti =
        Cars("lacetti","chevrolet",4)
    println(lacetti.describe())
    val bus =
        Cars("kia","kia",2)
    println(bus.describe())
}
/*
output
Car name is lacetti model chevrolet and doors have 4
Car name is kia model kia and doors have 2c
 */
