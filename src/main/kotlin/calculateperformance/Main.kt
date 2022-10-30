package calculateperformance

import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main() {
    val (value, duration) = measureTimedValue { longOperation() }
    println("It took $duration to calculate $value.")
}

fun longOperation(): String {
    repeat(2_000_000) {
        print(".")
    }
    return "Done"
}