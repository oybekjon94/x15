package generic


fun main(){
    val stringList:ArrayList<String> = arrayListOf<String>("oybek","sherbek")
    val s:String = stringList[0]
    println("printing the string value of stringList: $s")
    printValue(stringList)
    val floatList: ArrayList<Float> = arrayListOf(10.5f,5.0f,5f)
    printValue(floatList)
}
fun <T>printValue(list: ArrayList<T>){
    for (element in list){
        println(element)
    }
}