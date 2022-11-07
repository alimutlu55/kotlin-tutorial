package collections


fun main() {
    list()
    set()
    map()
}

//We can also create a read-only Map using method mapOf() and read-write MutableMap using mutableMapOf():
private fun map() {
    val theMap = mapOf(1 to "one", 2 to "two", 3 to "three")

    val theMutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
}


//Similarly we can create a read-only Set using method setOf() and read-write MutableSet using mutableSetOf():
private fun set() {
    val theSet = setOf("one", "two", "three")

    val theMutableSet = mutableSetOf("one", "two", "three")
}

//We can create a simple read-only List using method listOf() and read-write MutableList using mutableListOf():
private fun list() {
    val theList = listOf("one", "two", "three")
    theList[0]

    val theMutableList = mutableListOf("one", "two", "three")
    theMutableList.add("hello")
}