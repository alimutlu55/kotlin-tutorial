package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
The name of runBlocking means that the thread that runs it (in this case — the main thread) gets blocked for the duration of the call,
until all the coroutines inside runBlocking { ... } complete their execution.
You will often see runBlocking used like that at the very top-level of the application and quite rarely inside the real code,
as threads are expensive resources and blocking them is inefficient and is often not desired.
 */
fun main(){
    runBlocking {// Blocks the main thread.
        launch {
            delay(1000)
            println("World")
        }
    }
    println("Hello")
}