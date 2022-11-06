package nullable

/*
A nullable type is a variation of a type that permits null values.
You declare a type to be nullable by adding a question mark after it:
 */
class Person2(val name: String)
fun main() {
    var name: String = "oybek"
    name = null // this is not
    var name2: String? = "oybek"
    name2 = null
    var age: Int = 32
    age = null // this is not
    var age2: Int? = 32
    age2 = null
    var person: Person2 = ("oybek")
    person = null // this not
    var person2: Person2? = Person2("oybek")
    person2 = null
}