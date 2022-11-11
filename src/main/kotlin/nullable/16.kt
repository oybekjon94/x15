package nullable

fun main(){
    var str: String? = "GeeksForGeeks"
    println(str?.length)
    str = null
    //?: elvis operator 는 객체가 null 이 아니라면 그대로
    // 사용하지만 sample null 이니까 대신 default  를 서야겠다
    println(str?.length ?: "-1")
}