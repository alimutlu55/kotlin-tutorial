package nullsafety

fun main() {
    nonNull()
//    nullable()
//    nullableLength()
//    safeCall()
//    list()
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

fun list() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
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


