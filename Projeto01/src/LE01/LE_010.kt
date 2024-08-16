package LE01

fun LE_010() {
    println("Escreva um número de 1 a 5")

    val input = readln()!!.toInt()

    when(input) {
         1 -> print("Um")
         2 -> print("Dois")
         3 -> print("Três")
         4 -> print("Quatro")
         5 -> print("Cinco")

        else -> println("Número invalido")
    }
}