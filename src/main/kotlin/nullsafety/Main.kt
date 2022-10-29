package nullsafety

fun main() {
    nonNull()
//    nullable()
//    nullableLength()
//    safeCall()
//    let()
//    also()
//    run()
//    elvisOperator()
//    nonNullOperator(null) // throws Exception
//    safeCast()
}

fun nonNull() {
    var a: String = "abc" // Regular initialization means non-null by default
    // a = null // compilation error
    val l = a.length
}

fun nullable() {
    var b: String? = "abc" // can be set to null
    b = null // ok
    print(b)
}

fun nullableLength() {
    var b: String? = "abc" // can be set to null
    // val l = b.length // compilation error
}

fun safeCall() {
    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call
}

fun let() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}

fun also() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    var res = listOf<String?>()
    for (item in listWithNulls) {
        item?.let { res = res.plus(it); it }
            ?.also { it -> println("non nullable value: $it") } //If we want to apply some additional operation, for example logging on every non-nullable value we can use an also() method and chain it with a let():
    }
}

fun run() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    var res = listOf<String?>()
    for (item in listWithNulls) {
        item?.run { res = res.plus(this) } // It's like let but the Run() Method operates on this reference instead of a function parameter:
    }
    println(res)
}


fun elvisOperator() {
    val b: String? = "abc" // can be set to null
    val l = b?.length ?: -1
    println(l)
}


fun nonNullOperator(text: String?) {
    val l = text!!.length // throws an exception if the value is null.
}


fun safeCast() {
    var a: String? = null
    val aInt: Int? = a as? Int // wont throw an Exceptions
    // val aIntThrowException: Int = a as Int
}


