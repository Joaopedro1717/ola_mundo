package LE01

import kotlin.math.pow
import kotlin.math.PI

fun LE_019() {

    fun calcVolume(raio: Double, altura: Double): Double {
        return PI * raio.pow(2) * altura
    }

    print("Informe o raio ")
    val raio = readln().toDouble()

    print("Informe a altura ")
    val altura = readln().toDouble()

    val volume = calcVolume(raio, altura)

    println("O volume do cilindro é %.2f".format(volume))
}