

// write a program to multiply two numbers
// using return int method and non-return method


fun main() {
    val num1 = 4
    val num2 = 5

    // using return type
    println("product of $num1 and $num2 is ${getProductOf(num1, num2)}")

    // non-return type
    val product = num1 * num2
    println("product of $num1 and $num2 is $product")
}

/**
 * @param a:Int first operand
 * @param b:Int second operand
 *
 * @return product of a and b :Int
 */
private fun getProductOf(a:Int, b:Int) = a * b