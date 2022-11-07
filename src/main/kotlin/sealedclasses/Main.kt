package sealedclasses


/*

Sealed Classes allow us to fix type hierarchies and forbid developers from creating new subclasses.

They are useful when we have a very strict inheritance hierarchy, with a specific set of possible subclasses and no others.
As of Kotlin 1.5, sealed classes can have subclasses in all files of the same compilation unit and the same package.
 */
sealed class Optional<out V> {
    // ...
    abstract fun isPresent(): Boolean
}

data class Some<out V>(val value: V) : Optional<V>() {
    // ...
    override fun isPresent(): Boolean = true
}

class None<out V> : Optional<V>() {
    // ...
    override fun isPresent(): Boolean = false
}
