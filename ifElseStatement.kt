package ch02

class ifElseStatement {
}



fun main(){

    /**
     * if else statement in kotlin
     * **/
//    val tag = "kotlin android-learning"
//
//    if(tag == "kotlin"){
//
//        println("This is kotlin language")
//    }else if (tag == "android") {
//        println("yeah This is  kotlin programming  language")
//    }else {
//        println("I do not know")
//    }


    val number = -10

   val result = if (number > 0) {
        println("Positive number")
       number
    } else {
        println("Negative number")
       number
    }

   println("Result return $result")

}

