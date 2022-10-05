package ch02


/**
 * num1 and num2 are being declared global
 * */
    val num1 = 10
    val num2 = 15


fun main() {
    var count: Int = 0  //32 bit
    val number: Int = 42

    val otherNumber = 43

    val myLong: Long = 3000000000L
    val myByte: Byte = 127
    val myShort: Short = 32767

    val myDouble: Double = 98.6
    val myFloat: Float = 12.2F
    val alsoDouble = 101.5

    val asInt = alsoDouble.toInt()
    val asFloat = myLong.toFloat()

    val maxInt = 2_147_483_648

  println(firstValue())
   println(secondValue())
    //multiplyTwoVariablesForMe()
   // println(multiplyWithReturnType())

}

fun firstValue():Boolean{
   // println("I return true")
    return true
}


fun secondValue():Boolean{
   // println("I return false")
    return false
}


fun multiplyTwoVariablesForMe(){
    val result = num1 * num2
    println("This is from multiplyTwoVariablesFor $result")
}


fun multiplyWithReturnType():Int{
    return num1 * num2
}
