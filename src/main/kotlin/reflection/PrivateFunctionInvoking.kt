package reflection

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.isAccessible

fun main(){
    // instantiating an object from the Dummy class
    val dummy = Dummy("Reflection is powerful")

    // fetching the class from the object reference
    // the type of dummyClass is KClass<out Dummy>
    val dummyClass = dummy::class

    // the type of the functions variable would be Collection<KFunction<*>>
    val functions = dummyClass.memberFunctions

    // getting the particular private function
    val privateDummyFunction = functions.find{it.name == "dummyFunction3"}

    // we need to explicitly make it accessible
    privateDummyFunction?.isAccessible = true

    // invoking the function with and object of the
    // corresponding class as an argument
    privateDummyFunction?.call(dummy)
}
