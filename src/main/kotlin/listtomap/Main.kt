package listtomap

data class Color(var name: String, var hex: String)

fun main() {
    val colors: List<Color> = listOf(
        Color("SILVER", "#C0C0C0"),
        Color("GOLD", "#FFD700"),
        Color("OLIVE", "#808000")
    )

    val map: Map<String, String> = colors.associate { it.name to it.hex }
    println(map)        // {SILVER=#C0C0C0, GOLD=#FFD700, OLIVE=#808000}


    val mapBy: Map<String, String> = colors.associateBy({ it.name }, { it.hex })
    println(mapBy)        // {SILVER=#C0C0C0, GOLD=#FFD700, OLIVE=#808000}


    val mapSelector = colors.associateBy(keySelector = { color -> color.name },
        valueTransform = { color -> color.hex })
    println(mapSelector)        // {SILVER=#C0C0C0, GOLD=#FFD700, OLIVE=#808000}


    val toMap: Map<String, String> = colors.map { it.name to it.hex }.toMap()
    println(toMap)


    val iterateMap: MutableMap<String, String> = HashMap()
    for (color in colors) {
        iterateMap[color.name] = color.hex
    }
    println(iterateMap)        // {SILVER=#C0C0C0, GOLD=#FFD700, OLIVE=#808000}
}