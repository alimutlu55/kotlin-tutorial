package extensionfunctions

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

val Int.addFive: Int
    get() = this.plus(5)

fun Circle.perimeter(): Double {
    return 2 * Math.PI * this.radius;
}

fun MutableList<String>.concatenateLowercase(): String {
    return this.map { s -> s.lowercase() }.joinToString { "" }
}

fun Int.doubleValue() : Int {
    return this * 2
}

val <T> List<T>.penultimateElement: T?
    get() = if (isEmpty())
        null
    else
        this[size - 2]

fun Any?.hashCode(): Int {
    if (this == null) {
        return 0
    }

    // 'this' is no longer nullable here

    // fallback logic
    // calling the original hashCode method defined in the
    // Any class
    return hashCode()
}
