package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
Let's extract the block of code inside launch { ... } into a separate function.
When you perform "Extract function" refactoring on this code, you get a new function with the suspend modifier.
This is your first suspending function.
Suspending functions can be used inside coroutines just like regular functions,
but their additional feature is that they can, in turn, use other suspending functions (like delay in this example) to suspend execution of a coroutine.
 */

fun main() = runBlocking { // this: CoroutineScope
    launch { doWorld() }
    println("Hello")
}

// this is your first suspending function
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}