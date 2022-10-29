package generics

import org.junit.jupiter.api.Assertions.assertTrue

class ParameterizedClass<A>(private val value: A) {

    fun produce(): A {
        return value
    }

    fun consume(message: A) {
        print(value)
    }
}

fun main(){
    val parameterizedClass = ParameterizedClass<String>("string-value")

    val res = parameterizedClass.produce()
    parameterizedClass.consume("text")

    assertTrue(res is String)
}