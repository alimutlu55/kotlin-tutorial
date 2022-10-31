package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//launch is a coroutine builder.
//It launches a new coroutine concurrently with the rest of the code, which continues to work independently.
//That's why Hello has been printed first.

//If you remove or forget runBlocking in this code, you'll get an error on the launch call, since launch is declared only on the CoroutineScope

fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}


