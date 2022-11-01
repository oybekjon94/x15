package constructor

//You initialize a new object by passing information to a constructor
   class Alien(name: String){
       val greeting = "Poor $name"
   }

fun main(){
    val alien  = Alien("Mr. Messekes")
    println(alien.greeting)
}
/*
output
Poor Mr. Messekes
 */