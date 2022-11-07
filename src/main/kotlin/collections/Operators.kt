package collections


fun main() {
    inOperator()
    concatLists()
}

//We can an element or entire collection to another using “+” operator:
private fun concatLists() {
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("four", "five", "six")
    val resultList = firstList + secondList

    println(resultList.contains("two"))
    println(resultList.contains("five"))
}


//We can use the expression “x in collection” which can be translated to collection.contains(x):
private fun inOperator() {
    val theList = listOf("one", "two", "three")

    println("two" in theList)
}