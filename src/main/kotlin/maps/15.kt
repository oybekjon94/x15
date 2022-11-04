package maps

fun main(){
    val dictionary = mutableMapOf("Hello" to "salom", "bye" to "hayr")
    //we can add keys and value
    dictionary["father"] = "ota"
    //we can add keys and value
    dictionary.put("mother","ona")
    //we can add keys and value
    dictionary+="brother" to "aka"
    // we can change value but we can't change keys
    dictionary["hello"] = "Assalomu aleykum"
    for (keys in dictionary){
        println(keys)
    }
    // how many keys and values in there?
    val size = dictionary.size
    println(size)
    // we can remove keys
    dictionary.remove("Hello")
    val size2 = dictionary.size
    println(size2)
}