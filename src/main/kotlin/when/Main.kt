package `when`

fun main() {
      commonUsage()
//    fewPossibilities()
//    checkValueInRange()
//    particularType("123")
//    months()
//    isOddEven()
}

fun commonUsage() {
    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}


fun fewPossibilities() {
    val n = -1

    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }
}

fun checkValueInRange() {
    val a = 100

    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }
}

fun particularType(x: Any) {
    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
}

fun months() {
    print("Enter number of the Month: ")
    var monthOfYear = readLine()!!.toInt()
    var month = when (monthOfYear) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Not a month of year"
    }
    print(month)
}

fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

fun isOddEven() {
    var num = 8
    when {
        isOdd(num) -> println("Odd")
        isEven(num) -> println("Even")
        else -> println("Neither even nor odd")
    }
}