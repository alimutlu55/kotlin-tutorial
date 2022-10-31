package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

/*
In a real application, you will be launching a lot of coroutines.
Structured concurrency ensures that they are not lost and do not leak.
An outer scope cannot complete until all its children coroutines complete.
Structured concurrency also ensures that any errors in the code are properly reported and are never lost.
 */


fun main() = runBlocking {
    println(concurrentSum())
}


suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    one.await() + two.await()
}