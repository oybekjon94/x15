package generic

//Generics create parameterized types: components that work across multiple types.
fun main(){
    Event<String>("oybek")
    Event(256)
    Event(true)
}
class Event<T>(value: T){
    init {
        //기본 constructor에서는 코드가 포함될 수 없으며, 초기화 코드는 init block으로 시작해야 한다는 정의입니다.
        println(value.toString().length)
    }
}