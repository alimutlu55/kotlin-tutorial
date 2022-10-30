package reflection

class Dummy(private var dummyString: String){

    // plain old function that prints the value of the property
    fun dummyFunction1() = println("The dummyString is $dummyString")

    // absolutely irrevelant function to show that
    // you can pass arguments too
    fun dummyFunction2(dummyArg: Int) = println("The dummyArg is $dummyArg")

    // a private function for demonstration's sake
    private fun dummyFunction3() = println("private dummy function invoked")
}