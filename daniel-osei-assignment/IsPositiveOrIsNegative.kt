

// write a program to check whether a number is positive or negative


fun main() {
    // any number is positive when greater than zero,
    // else number is negative

    val number = 8
    val isPosOrNeg = when{
        number > 0 -> "is positive"
        number < 0 -> "is negative"
        else -> "is zero"
    }
    println(isPosOrNeg)
}