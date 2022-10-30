package reflection

import kotlin.reflect.full.memberFunctions

fun main(){
    // instantiating an object from the Dummy class
    val dummy = Dummy("Reflection is powerful")


    // fetching the class from the object reference
    // the type of dummyClass is KClass<out Dummy>
    val dummyClass = dummy::class

    // the type of the functions variable would be Collection<KFunction<*>>
    val functions = dummyClass.memberFunctions

    // fetching a particular function
    // the type of dummyFunction1 would be KFunction<*>?
    val dummyFunction1 = functions.find{it.name == "dummyFunction1"}

    // a null-safe call is required as the receiver is nullable
    // to invoke the function the call function is used

    // the first argument of that function call must be an
    // object created from the same class
    dummyFunction1?.call(dummy)

    // fetching another function
    val dummyFunction2 = functions.find{it.name == "dummyFunction2"}

    // if that function receives one or more arguments
    // those arguments would follow the "object" argument
    dummyFunction2?.call(dummy, 2021)
}