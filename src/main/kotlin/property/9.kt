package property

import atomictest.eq

class Data2(var i: String)
fun main(){
    val data = Data2("oybek")
    data.i eq "sherbek"
    println(data.i)

    data.i eq "oybek"
    println(data.i)
}