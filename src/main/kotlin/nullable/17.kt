package nullable

fun main(){
    var str: String? = "GeeksForGeeks"
    println(str!!.length)
    str = null
    //!!.non-null assertion operator 는 참조연산자를 사용할 때
    // null 여부를 컴파일 시 확인하지 않도록 하여 runtime 시 null
    // pointer exception이 나도록 의도적으로 방치하는 연산자

    //str!!.length // error
    println(str)
}