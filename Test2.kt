package ch02

class Test2 {
//calculate the area of a triangle and a square and rectangle
}
 fun main(){
 //println("The area of the square is : ${calculateAreaOfSquare()}")
    println( calateAreaOfRectangle())

     val amaAge = calculateTheAgeOfAma()
    // println(amaAge)
    // calculateAgeAmaSecond()
    println( calculateAreaAndPerimeterOfRectangle())
}

//formula to calculate the area of square
fun calculateAreaOfSquare(){
    val side1 = 4
    val side2 = 5
    val area = side1 * side2
    println("Print without return type $area")
    //area side * side
    //return "Print without return type $area"


    val greeting = "Hello there"
    val owe = 50

    val janet = "I owe Janet \$$owe dollars"
    println(greeting)

    val infinity = "The infinity symbol is \u221E"
    println(infinity)
}

//get the area of a rectangle
//L= 5 W = 3

fun calateAreaOfRectangle():String{
    val l = 6
    val w = 3
    val area = l*w

    return " the area of a rectangle is $area"
}


//var a= 1990 Ama
//calculate the age of ama
fun calculateTheAgeOfAma():Int {
    val yearBorn = 1990
    val currentYear = 2022
    return currentYear - yearBorn
}

fun calculateAgeAmaSecond(){
    val yearBorn = 1990
    val currentYear = 2022

    val age = currentYear-yearBorn
    println("This is from second function $age")
}


//calculate the area of a triangle
//perimeter and area

fun calculateAreaAndPerimeterOfRectangle():Double{
    val L:Double = 5.6
    val B:Double = 8.5
    val perimeter = 2.0 * (L + B)

    val area =  L * B
   return area
}








