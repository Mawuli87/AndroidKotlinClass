// Q1. Write a program to check Leap Year


fun main() {
    // leap year is a year which is equally divisible by 4
    val year = 2022
    println(
        if ((year%4)== 0) "$year is leap" else "$year not leap"
    )
}