package nullable

fun main(){
    // var a: String? = null  실행되지 않다
    var a: String? = "kotlin exam" //  실행된다

    a?.run { // scope 함수 run 실행된다, ?.를 if 문 대산 사용 편리
        println(toUpperCase())
        println(toLowerCase())
    }
}