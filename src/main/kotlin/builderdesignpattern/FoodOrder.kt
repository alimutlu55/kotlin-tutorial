package builderdesignpattern

class FoodOrder private constructor(builder: FoodOrder.Builder) {

    val bread: String?
    val condiments: String?
    val meat: String?
    val fish: String?

    init {
        this.bread = builder.bread
        this.condiments = builder.condiments
        this.meat = builder.meat
        this.fish = builder.fish
    }

    class Builder {
        var bread: String? = null
            private set
        var condiments: String? = null
            private set
        var meat: String? = null
            private set
        var fish: String? = null
            private set

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(this)
    }
}

class KotlinFoodOrder private constructor(
    val bread: String?,
    val condiments: String?,
    val meat: String?,
    val fish: String?) {

    data class Builder(
        var bread: String? = null,
        var condiments: String? = null,
        var meat: String? = null,
        var fish: String? = null) {

        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = KotlinFoodOrder(bread, condiments, meat, fish)
    }
}

fun main() {
    val foodOrder = KotlinFoodOrder.Builder()
        .bread("white bread")
        .meat("bacon")
        .condiments("olive oil")
        .build()
}