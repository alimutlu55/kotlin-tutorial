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

    // printing the name of all the functions
    functions.forEach{println(it.name)}
}