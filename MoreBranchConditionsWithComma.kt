package ch02

class MoreBranchConditionsWithComma {
}

fun main(){


    val n = -1
    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than 3.")
    }


    val a = 100

    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }

     val x = 10

    when (x) {
        is Int -> print(x + 1)
       /// is String -> print(x.length + 1)
        //is IntArray -> print(x.sum())
    }



}