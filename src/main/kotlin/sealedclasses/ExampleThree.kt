package sealedclasses

// A sealed class with a single subclass defined inside
sealed class ABC {
    object X : ABC()
}

// Another subclass of the sealed class defined
object Y : ABC() {
    object Z : ABC()  // This will cause an error. Sealed class is not visible here
}