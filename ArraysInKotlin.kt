package ch02

class ArraysInKotlin {

    data class Person(
        var name:String,
        var age:Int,
        var location:String,
        var profession:String
    )


}

fun main(){
    val name  = arrayListOf<String>("qw","wer","yuio")
   val studentName = arrayOf("Mawuli","Timothy","Daniel","Sarah","Fatima",66,23.8)

    val name1 = listOf("abb","12",12)
    val name3 = ArrayList<String>()
     name3.add("qww")

    name.add("wer")

    //first










    studentName.forEach { student ->
        println(student)
    }

    studentName.forEach {
        println(it)
    }
//    val names = ArrayList<String>()
//
//    names.add("Mawuli")
//    names.add("MawuliDuplicated")
//    names.add("Daniel")
//    names.add("Delali")
//    names.add("Mother")
//    names.add("Father")
//   names.remove("MawuliDuplicated")
//   // names.removeAt(1)
//
//    for (student in names){
//        println("Name = $student")
//    }

    val fives = Array(5, ::addIndex)
    fives.forEach { println(it) }






}

fun addIndex(index: Int): Int{
    return index * 5;
}