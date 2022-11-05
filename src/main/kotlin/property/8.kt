package property

import atomictest.eq
import javax.xml.crypto.Data

class Data(var i: Int)

fun main(){
    val data = Data(10)
    data.i eq 20
    data.i = 20
    println(data.i)
}