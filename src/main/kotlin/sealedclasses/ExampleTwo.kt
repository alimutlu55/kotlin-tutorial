package sealedclasses

sealed class DemoOne {
    class A : DemoOne() {
        fun display() {
            println("Subclass A of Sealed class Demo ")
        }
    }

    class B : DemoOne() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}

fun main(args: Array<String>) {
    val obj = DemoOne.B()
    obj.display()
    val obj1 = DemoOne.A()
    obj1.display()
}