package reflection

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

fun main(){
    // instantiating an object from the Dummy class
    val dummy = Dummy("Reflection is powerful")

    // fetching the class from the object reference
    // the type of dummyClass is KClass<out Dummy>
    val dummyClass = dummy::class

    // getting a collection of the properties
    // the type of the variable would be Collection<KProperty1<out Dummy, *>>
    val properties = dummyClass.memberProperties

    // finding the desired property among the list
    // casting it into a KMutableProperty
    val dummyString = properties.find { it.name == "dummyString" } as KMutableProperty<*>?


    // making it accessible explicitly
    dummyString?.isAccessible = true

    // manipulating the value
    dummyString?.setter?.call(dummy, "Reflection is dumb")

    // fetching the value of that property
    // using an instantiation of that class as an argument
    val value = dummyString?.getter?.call(dummy)

    // printing the value of the property
    println(value)
}