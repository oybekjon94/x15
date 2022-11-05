package overloading

class IncDecOverload(var str:String){
    //overloading increment function
    operator fun inc(): IncDecOverload{
        val obj = IncDecOverload(this.str)
        obj.str = obj.str + 'a'
        return obj
    }
    //overloading decrement function
    operator fun dec(): IncDecOverload{
        val obj = IncDecOverload(this.str)
        obj.str = obj.str.substring(0,obj.str.length-1)
        return obj
    }

    override fun toString(): String {
        return str
    }
}
fun main(){
    var obj = IncDecOverload("hello")
    println(obj++)
    println(obj--)
    println(++obj)
    println(--obj)
}