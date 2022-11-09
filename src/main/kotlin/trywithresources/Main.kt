package trywithresources

import java.io.FileWriter

/*
By design, it doesn’t have a language construct akin to try-with-resources in Java.

Instead, we can find an extension method called use in its standard library.
 */
fun main() {
    val writer = FileWriter("test.txt")

    writer.use {
        writer.write("something")
    }
}