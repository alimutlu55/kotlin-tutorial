package sealedclasses

sealed class DemoOne {
    object A : DemoOne() {
        fun display() {
            println("Subclass A of Sealed class Demo ")
        }
    }

    object B : DemoOne() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}

fun main(args: Array<String>) {
    val obj = DemoOne.B
    obj.display()
    val obj1 = DemoOne.A
    obj1.display()
}