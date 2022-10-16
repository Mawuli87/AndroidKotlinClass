package ch02

/**
 * 1-write a program to check Leap Year
2-write a program to Check Whether a Number is Positive or Negative
3-write a Program to Find the Largest Among Three Numbers
4-write a program to multiply two integers by using
the return integer method and non return value method
 *
 *
 * **/

val numberOne = 5
val numberTwo = 6

fun main(){

    val resultOne = println("From return type : ${multiplyAndReturn()}")
    multiplyButDontReturn()

}

private  fun multiplyAndReturn():Int{
    return numberOne * numberTwo
}

private fun multiplyButDontReturn(){
    println("From printlin : ${numberOne * numberTwo}")
}