package ch02


fun main (){
   val list = listOf(1,2,2,3,4,4,5,6,7,8,9)

    val set = setOf(10, 20, 30, 40, 50,3,9,200,656)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

      val tList = list.map{
       it * 2}

    println("Raw list $list")
//    val mapList = list.map { listItem ->
//        listItem * 2
//
//    }

    val mapList = list.map {
        it * 2

    }
    println(mapList)

    println("********************************************")

    val tMap = map.map{ Pair(it.key, it.value * 10)}.toMap()
    println("transformed map = $tMap")

   println("****************************************************")
    println()
    val fList = list.filter { it % 2 == 1}
    println("only odd = $fList")
    val fSet = set.filter { it > 100 }
    println("Is fSet empty? = ${fSet.isEmpty()}")

    println("**********************************************")
    println("sorted descending set = ${set.sortedDescending()}")

 println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++")

 println()
 println("tList last: ${tList.last { it > 2}}")

 println("***************==============================")

 println("list to set = ${list.toSet()}")
 println("set to list = ${set.toSet()}")

}