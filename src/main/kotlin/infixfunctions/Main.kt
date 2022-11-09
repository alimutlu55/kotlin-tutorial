package infixfunctions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals

class Assertion<T>(private val target: T) {
    infix fun isEqualTo(other: T) {
        assertEquals(other, target)
    }

    infix fun isDifferentFrom(other: T) {
        assertNotEquals(other, target)
    }
}

infix fun String.substringMatches(r: Regex) : List<String> {
    return r.findAll(this)
        .map { it.value }
        .toList()
}


fun main() {
   // isEqual()
    substringMatches()
}

private fun substringMatches() {
    val matches = "a bc def" substringMatches ".*? ".toRegex()
    assertEquals(listOf("a ", "bc "), matches)
}

private fun isEqual() {
    val result = Assertion(5)

    result isEqualTo 5 // This passes
    result isEqualTo 6 // This fails the assertion
    result isDifferentFrom 5 // This also fails the assertion
}