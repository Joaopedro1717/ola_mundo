package LE01

import kotlin.math.sqrt

fun LE_015() {

    fun calcDistancia(x1: Double, y1: Double, x2: Double, y2: Double): Double {
        val deltaX = x2 - x1
        val deltaY = y2 - y1

        return sqrt(deltaX * deltaX + deltaY * deltaY)
    }

    print("Informe x1: ")
    var x1 = readln().toDouble()

    print("Informe y1: ")
    var y1 = readln().toDouble()

    print("Informe x2: ")
    var x2 = readln().toDouble()

    print("Informe y2: ")
    var y2 = readln().toDouble()

    val distance = calcDistancia(x1, y1, x2, y2)

    println("Distância: %.2f".format(distance))
}