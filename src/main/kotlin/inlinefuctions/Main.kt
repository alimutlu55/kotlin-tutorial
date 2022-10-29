package inlinefuctions

import kotlinx.coroutines.delay

/*
Basically inline tells the compiler to copy these functions and parameters to call site instead of creating object for blocks.
 */
suspend fun main() {
    print(5) { getStringSlowly() }
   // inlineFunction { println("Outsite of inline fun") }
}

suspend fun getStringSlowly(): String {
    delay(1000)
    return "MyString"
}


inline fun print(count: Int, printer: () -> String) {
    repeat(count) {
        println(printer())
    }
}

inline fun inlineFunction(generate: () -> Unit) {
    generate()
    println("Inside of inline fun.")
}
