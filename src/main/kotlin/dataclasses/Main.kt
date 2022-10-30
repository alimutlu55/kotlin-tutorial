package dataclasses

//The class declaration must start with data
//It must have at least one constructor parameter
//All constructor parameters must be vals or vars
//A data class can’t be open, sealed, abstract, or an inner classes
//The parent of a data class isn’t available to the compiler to use in defining the generated copy() function


//Kotlin Data class automatically creates the following functions for you.
//
//equals() and hashCode()
//toString() of the form "Book(name=JournalDev, authorName=Anupam)"
//componentN() functions for each of the parameters in the order specified. This is known as destructuring declarations.
//copy()
data class Book(
    var name: String,
    var authorName: String = "Anupam",
    var lastModified: Long = 1234567,
    var rating: Float = 5f,
    var downloads: Int = 1000
)


fun main(args: Array<String>) {
    createBook()
    copy()
    destructuring()
}

fun createBook() {
    var book = Book("Android tutorials", "Anupam", 1234567, 4.5f, 1000)

    book = Book("Kotlin")
    book = Book("Swift", downloads = 500)
    book = Book("Java", "Pankaj", rating = 5f, downloads = 1000)
    book = Book("Python", "Shubham", rating = 5f)
}


fun copy() {
    val book = Book("Android tutorials", "Anupam", 1234567, 4.5f, 1000)
    println(book)

    val newBook = book.copy(name = "Kotlin")
    println(newBook)
}


fun destructuring() {
    val book = Book("Android tutorials","Anupam", 1234567, 4.5f, 1000)
    val (n,a,date,rating,downloads) = book
    println(n)
}
