package generics

import org.junit.jupiter.api.Assertions.assertTrue

//In (contravariance type)
//If your generic class only use the generic type as input of it’s function/s, then in is used i.e.

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

fun main(){
    val parameterizedConsumer = ParameterizedConsumer<Number>()

    val ref: ParameterizedConsumer<Double> = parameterizedConsumer

    assertTrue(ref is ParameterizedConsumer<Double>)
}

