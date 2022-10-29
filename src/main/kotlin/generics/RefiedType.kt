package generics

import org.junit.platform.commons.logging.Logger
import org.junit.platform.commons.logging.LoggerFactory


inline fun <reified T> Iterable<*>.filterIsInstance() = filter { it is T }

inline fun <reified T> logger(): Logger = LoggerFactory.getLogger(T::class.java)

fun main(){
    val set = setOf("1984", 2, 3, "Brave new world", 11)
    println(set.filterIsInstance<Int>())
}

class User {
    private val log = logger<User>()

    // ...
}