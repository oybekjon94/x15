package lists

fun main(){
    var stringList = listOf<String>("oybek","sherbek","nurbek")
    var list = listOf<String>("otabek","elbek","xidirbek")
    for(element in stringList){
        print(element+"")
    }
    println()
    println(stringList.get(0))
    println(stringList.indexOf("elbek"))
    println(stringList.lastIndexOf("elbek"))
    println(stringList.size)
    println(stringList.contains("xidirbek"))
    println(stringList.containsAll(list))
    println(stringList.subList(1,2))
    println(stringList.drop(1))
    println(stringList.dropLast(2))
}