package delegates

class User(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}

val user = User(
    mapOf(
        "name" to "John Doe",
        "age" to 25
    )
)


fun main() {
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25
}