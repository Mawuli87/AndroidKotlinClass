package functions

import java.text.SimpleDateFormat
import java.util.*


fun main(){
   // val result = calculateNumbers()
   // println("The result is $result")

   val currentDate = checkWhetherItIs6Pm()
    //println("Current date : $currentDate")

  val trueOrFalse =  checkWhetherItIs6PmOrNot()
   // println("True or false $trueOrFalse")

  val result =   multiplyTwoIntegersForMe(4,6)
    println("Result Multiplication : $result")
    println(multiplyTwoIntegersForMe(4,6))
}



fun calculateNumbers():Int{
   val addTwo = 4 + 10
    return addTwo
}


fun checkWhetherItIs6Pm():String{
    val sdf = SimpleDateFormat("yyyy-MM-dd' Time : 'HH:mm:ss.SSS")
    return sdf.format(Date())
}

//return boolean
fun checkWhetherItIs6PmOrNot(): Boolean {
    val dateNow = Calendar.getInstance().time.hours
      if (dateNow == 18)
       return true
      else
    return false

}

fun checkWhetherItIs6PmOrNotSecondMethod(): Boolean {
    val dateNow = Calendar.getInstance().time.hours
    return dateNow == 18

}


fun multiplyTwoIntegersForMe(value1:Int,value2:Int): Int{

    return value1 * value2
}

