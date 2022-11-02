package constructor

class Add3{
    constructor(d: String, v: String){
        var v = d + v
        println("My name is Oybek and my surname is Kholikov : ${v}  ")
    }
}
fun main(){
    Add3("Oybek " ,"Kholikov")
}