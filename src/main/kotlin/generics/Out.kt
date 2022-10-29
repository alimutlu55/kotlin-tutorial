package generics

import org.junit.jupiter.api.Assertions.assertTrue

//Out (covariant type)
//If your generic class only use the generic type as output of it’s function/s, then out is used i.e.

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

fun main(){
    val parameterizedProducer = ParameterizedProducer("string")

    val ref: ParameterizedProducer<Any> = parameterizedProducer

    assertTrue(ref is ParameterizedProducer<Any>)
}

