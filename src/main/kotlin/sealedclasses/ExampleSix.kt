package sealedclasses

//Sealed interfaces allow multiple inheritance

// to define two new subhierarchies
sealed interface DinnerMenu
sealed interface LunchMenu

sealed class Menu {
    // resticting the Menu hieararchy to LaunchMenu and DinnerMenu
    data class PIZZA(val name: String, val size: String, val quantity: Int): Menu(), DinnerMenu
    data class BURGER(val quantity: Int, val size: String): Menu(), LunchMenu
    data class CHICKEN(val quantity: Int, val pieces: String): Menu(), LunchMenu
}