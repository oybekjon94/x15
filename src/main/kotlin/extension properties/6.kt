package `extension properties`

class Foo(){
    fun sayHello(){
        println("hello worlld")
    }

    fun sayBye(){
        println("Bye!")
    }
}
class User(val name: String, val foo: Foo){
    //extending Foo with a new function
    fun Foo.sayGoodbye(){
        //calling the Foo sayBye() function
        this.sayBye()

        //calling the User sayGoodBye() function
        this@User.sayGoodbye()
    }

    fun sayGoodbye(){
        println("Goodbye , World")
    }

    fun introduceYourself(){
        foo.sayHello()// hello,world
        println("my name is ${name}")
        sayGoodbye() //"Goodbye , World"
    }
    fun introduceYourselfWithExtendedFoo(){
        foo.sayHello()//hello world
        println("my name is ${name}")
        foo.sayGoodbye()//bye
                        //goodbye , world
    }

}
fun main(){
    val foo = Foo()

    User("maria", foo).introduceYourself()
    println("------------")
    User("maria", foo).introduceYourselfWithExtendedFoo()

    // foo.saidGoodBye() --> Error! the extension function is unavailable outside User
}