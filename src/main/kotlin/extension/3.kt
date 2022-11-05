package extension
open class Base{ }

class Derived : Base(){ }

open class BaseCaller{
    open fun Base.printFunctionInfo(){
        println("base extension function in basecaller")
    }
    open fun Derived.printFunctionInfo(){
        println("derived extension function in baseCaller")
    }
    fun call(b: Base){
        b.printFunctionInfo() //call the extension function
    }
}

class DerivedCaller: BaseCaller(){
    override fun Base.printFunctionInfo() {
        println("base extension function in DerivedCaller")
    }

    override fun Derived.printFunctionInfo(){
        println("Derived extension function in DerivedCaller")
    }
}
fun main(){
    BaseCaller().call(Base()) // "Base extension function in BaseCaller"
    DerivedCaller().call(Base()) // "Base extension function in DerivedCaller"
    DerivedCaller().call(Derived()) //// "Base extension function in DerivedCaller" - extension receiver is resolved statically
}