package exception

fun main(){
    try {
        //Adding mutable element
        val numbers = mutableListOf(1,2,3)
        // Looping through a list
        for (item in numbers){
            //trying make changes to that list at same time
            numbers.removeAt(1)
        }
    }catch (e: ConcurrentModificationException){
        print(e)
    }
}