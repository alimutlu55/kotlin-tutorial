package generics

val integers = listOf(1, 2, 3, 4, 5, 6, 7)
val strings = listOf("12", "233", "31233", "42", "52")

fun main() {
    val filteredIntegers = integers.customFilter { it > 3 }.toList()
    println(filteredIntegers)

    val filteredStrings = strings.customFilter { it.length == 2 }
    println(filteredStrings)
}

fun <T> List<T>.customFilter(filterFunc: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFunc(item)) {
            resultList.add(item)
        }
    }
    return resultList
}