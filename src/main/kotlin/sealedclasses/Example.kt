package sealedclasses

sealed class A{
    class B : A()
    {
        class E : A() //this works.
    }
    class C : A()

    init {
        println("sealed class A")
    }

}

class D : A() //this works
{
    class F: A() //This won't work. Since sealed class is defined in another scope.
}


fun main(args: Array<String>)
{
   // var a = A() //compiler error. Class A cannot be instantiated.
}


