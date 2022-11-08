package sealedclasses

// A sealed class with a single subclass defined inside
sealed class ABC {
    class X: ABC()
}

// Another subclass of the sealed class defined
class Y: ABC() {
    class Z: ABC()   // This will cause an error. Sealed class is not visible here
}