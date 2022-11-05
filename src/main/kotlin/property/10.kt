package property

import atomictest.trace

class Default {
    var i: Int = 0
    get(){
        trace("get()")
        return field
    }
    set(value){
        trace("set($value)")
        field = value
    }
}
fun main(){
    val d = Default()
    d.i = 2
    trace(d.i)
    trace eq """
        set(2)
        get()
        2
    """
    println(d.i)
}