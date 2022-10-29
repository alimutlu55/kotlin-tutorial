package deduplicating

val fruitBasket = listOf(
    "APPLE",
    "Apple",
    "Banana",
    "Cherry",
    "Apple",
    "Apple",
    "BANANA",
    "Durian"
)

fun main(){
    distinct()
    toSet()
    distinctBy()
}

fun distinctBy() {
    val reallyUnique = fruitBasket.distinctBy {
        it.lowercase()
    }
    println(reallyUnique)
}

fun distinct(){
    val unique = fruitBasket.distinct()
    println(unique)
}

fun toSet() {
    val unique = fruitBasket.toSet()
    println(unique)
}

