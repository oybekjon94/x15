package `if`

fun main(){
    var books = 1000
    var library = if (books < 10000){"there are very few books in the library"}
    else{"there are many books in the library"}
    print(library)
}