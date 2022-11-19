package ch02


fun main(){
    val fours = setOf(4,4,4,4,4,4,5,6,7,8,9,10)
    // println( fours.contains(8))
   //  println(fours)

    val threes = setOf("3, 3, 3, 3","")
   //println(threes)
  // println(fours)
   // println("size = ${threes.size}")
   // println("has a 4? ${threes.contains("4")}")

    val fset = mutableSetOf(1, 2, 3, 4, 5)
    val bset = mutableSetOf(5, 4, 3, 2, 1)
    println("firsts equal? ${fset.first() == bset.first()}")
    println("fset == bset? ${fset == bset}")

    println(fset)
    println(bset)
    println("This is hasset ${bset.toHashSet()}")

    val fset2 = hashSetOf(1, 2, 3, 4, 5)
    val bset2 = hashSetOf(5, 4, 3, 2, 1)
    println("firsts equal? ${fset2.first() == bset2.first()}")
    println("fset2 == bset2? ${fset2 == bset2}")

   println(fset2)
    println(bset2)



}