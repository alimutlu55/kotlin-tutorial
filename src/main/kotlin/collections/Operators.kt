package collections


fun main() {
  // inOperator()
  // concatLists()
  // removeList()
  // slicing()
  // filterNotNull()
  // filtering()
  // drop()
  // dropWhile()
  // grouping()
  // reduction()
  // chunk()
     chunk2()
}

fun chunk2() {
    val theList = listOf(1, 2, 3, 4, 5)
    val chunked = theList.chunked(3) { it.joinToString(", ") }

    println(chunked.size == 2)
    println(chunked.first())
    println(chunked.last())
}

private fun chunk() {
    val theList = listOf(1, 2, 3, 4, 5)
    val chunked = theList.chunked(2)

    println(theList.size)
    println(chunked.first().contains(1))
    println(chunked.first().contains(2))
    println(chunked[1].contains(3))
    println(chunked[1].contains(4))
    println(chunked.last().contains(5))
}

//We can perform fold/reduce operation:
private fun reduction() {
    val theList = listOf(1, 2, 3, 4, 5, 6)
    val finalResult = theList.fold(0) { acc, i -> acc + (i*i) }

    println(finalResult)
}

//We can group elements:
private fun grouping() {
    val theList = listOf(1, 2, 3, 4, 5, 6)
    val resultMap = theList.groupBy { it % 2 }

    println(resultMap.size)
    println(resultMap)
    println(resultMap[1]!!.contains(1))
    println(resultMap[2]!!.contains(5))
}

//We can drop the first few items if they satisfy the given condition:
private fun dropWhile() {
    val theList = listOf("one", "two", "three", "four")
    val resultList = theList.dropWhile { it.length < 4 }

    println(resultList.size)
    println(resultList.contains("one"))
    println(resultList.contains("two"))
}

//We can drop the first N items:
private fun drop() {
    val theList = listOf("one", "two", "three", "four")
    val resultList = theList.drop(2)

    println(resultList.size)
    println(resultList.contains("one"))
    println(resultList.contains("two"))
}

//We can filter collection items easily using filter(), which works similarly to the filter() method from Java Stream API:
private fun filtering() {
    val theList = listOf(1, 2, -3, -4, 5, -6)
    val resultList = theList.filter { it > 0 }
    println(resultList.size)
}

//We can easily remove all nulls from a List:
private fun filterNotNull() {
    val theList = listOf("one", null, "two", null, "three")
    println(theList.size)
    val resultList = theList.filterNotNull()
    println(resultList.size)
}

//We can obtain a sublist from a given List:
private fun slicing() {
    val theList = listOf("one", "two", "three")
    val resultList = theList.slice(1..2)

    println(resultList.size)
    println(resultList.contains("two"))
}

private fun removeList() {
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("one", "three")
    val resultList = firstList - secondList

    println(resultList.contains("two"))
    println(resultList.contains("one"))
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