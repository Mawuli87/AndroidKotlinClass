package ch02

data class Person(var firstName: String, var lastName: String)

fun main (){


//for (i in 2..15){
//    println("The value of i is : $i")
//}

//
//     val programingLang = arrayListOf("Mawuli","Edem","Daniel","Delali","Many more")
//
//     for (program in programingLang){
//         println("The name is $program")
//     }

//
//    val mixOfData = arrayListOf(2,"Mawuli",34.67,234567)
//      for (data in mixOfData){
//          println("Data is : $mixOfData")
//      }

//    val students = listOf("Janet", "Daisy", "Veronica", "Fernanda",23,56.98)
//
//    for ((index, student) in students.withIndex()) {
//        println("Student #${index + 1} is $student")
//    }

//
//    println("while")
//    var count = 5
//    while (count <= 5) {
//        println(count)
//        count++
//    }

//
//    var count = 0
//    println("do while")
//    do {
//        println(count)
//        count++
//    } while (count < 5)
//
//    println("break")
//    while (count > 0) {
//        if (count % 2 == 0) break
//        println(count)
//        count--
//    }


    var person: Person? = null

    val greeting: String? = "Hello there"
    if (greeting != null) {
        println("Joe says: '$greeting'")
    }

    println("greeting length = ${greeting?.length}")

    val len = greeting?.length ?: 0
    println("Length is $len")

    // exception when greeting is null
    val badLen = greeting!!.length

    val safeGreeting: String? = greeting as? String



    val studentName = arrayOf("Mawuli","Timothy","Daniel","Sarah","Fatima",66,23.8)
    for((index,data) in studentName.withIndex()){
        println("The index is : $index ")
    }






}