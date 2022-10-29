package extensionfunctions

fun main() {
    swap()
//    lastIndex()
//    removeFirstLastChar()
//    addFive()
//    concatenate()
//    double()
//    penultimateElement()
}

fun swap() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)
}
fun lastIndex() {
    val list = mutableListOf(1, 2, 3)
    println(list.lastIndex)
}
fun removeFirstLastChar() {
    val text = "helooo"
    println(text.removeFirstLastChar())
}
fun addFive() {
    val number = 50
    println(number.addFive)
}
fun concatenate() {
    val list = mutableListOf("First", "seConD", "ThIRd")
    list.concatenateLowercase()
}
fun double() {
    val i = 55
    println(i.doubleValue())
}
fun penultimateElement() {
    val list = mutableListOf("first", "second", "third")
    print(list.penultimateElement)
}