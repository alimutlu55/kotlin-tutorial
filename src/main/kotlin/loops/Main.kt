package loops


val fruits = listOf("Apple", "Banana", "Strawberry", "Orange")

fun main() {
    dots()
    // until()
    // lastIndex()
    // indices()
    // withIndex()
    // forEachIndexed()
}

fun forEachIndexed() {
    fruits.forEachIndexed { index, fruit ->
        println("$index : $fruit")
    }
}

fun withIndex() {
    for ((index, fruit) in fruits.withIndex()) {
        println("$index : $fruit")
    }
}

fun indices() {
    for (index in fruits.indices) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }
}

fun lastIndex() {
    for (index in 0..fruits.lastIndex) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }
}

fun dots() {
    for (index in 0..fruits.size - 1) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }
}

fun until() {
    for (index in 0 until fruits.size) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }
}