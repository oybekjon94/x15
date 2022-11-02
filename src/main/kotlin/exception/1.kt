package exception

/*
Exceptions are problems that occur during the program
execution and disrupt the conventional flow.
This can occur due to various reasons like invalid arithmetic
operation, a reference to a null object.
 */
fun main(){
   val arr = arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (e: Exception){
        println("Please check the array index")
    }
    finally {
        println("I will execute no matter what")
    }
    println("This will noy tun")
}