package ch02

import java.io.File


fun main(){

    val res = "./resources"
    val pets = "pets.txt"
    val pFile = File("${res}/$pets")

    val pList = listOf("cat", "dog", "bird")
    pFile.writeText("")
    pList.forEach{ pFile.appendText("$it\n")}

    val exists = pFile.exists()
    println("\npets exists? $exists")

}