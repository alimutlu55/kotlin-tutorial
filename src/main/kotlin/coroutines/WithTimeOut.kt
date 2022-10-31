package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking {
   // withTimeOut()
    withTimeOutOrNull()
}

suspend fun withTimeOut() {
    withTimeout(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
}

suspend fun withTimeOutOrNull() {
    val result = withTimeoutOrNull(1300L) {
        repeat(5) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
        "Done" // will get cancelled before it produces this result
    }
    println("Result is $result")
}
