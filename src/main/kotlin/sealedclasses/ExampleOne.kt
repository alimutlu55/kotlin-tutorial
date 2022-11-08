package sealedclasses

// Sealed classes and interfaces restrict which other classes or interfaces may extend or implement them.

sealed class Demo

fun main()
{
    //var d = Demo()     //compiler error
}