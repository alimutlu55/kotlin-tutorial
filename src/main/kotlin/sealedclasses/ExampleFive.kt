package sealedclasses

/*
Sealed classes give you the flexibility of having different types of subclasses and contain the state.
This means the heir of the sealed class can have as many as any number of instances and can store states, but the enum class cannot.
 */

sealed class MenuSealed {
    data class PIZZA(val name: String, val size: String, val quantity: Int) : MenuSealed()
    data class BURGER(val quantity: Int, val size: String) : MenuSealed()
    data class CHICKEN(val quantity: Int, val pieces: String) : MenuSealed()
}


/*
This adds a parameter to these three states.
However, it is impossible to have different states for a specific constant.
For example, if you have to add something like a size to PIZZA, it is impossible to use an enums class.
 */
enum class MenuEnum(val quantity: Int) {
    PIZZA(6),
    BURGER(4),
    CHICKEN(8)
}


fun main() {
    val burgerEnum = MenuEnum.BURGER
    println(burgerEnum.quantity)
    val pizzaEnum = MenuEnum.PIZZA
    println(pizzaEnum.quantity)

    val pizzaSealed = MenuSealed.PIZZA("Pizza", "55", 55)
    val burgerSealed = MenuSealed.BURGER(123, "55")

}