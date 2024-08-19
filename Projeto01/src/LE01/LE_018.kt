package LE01

fun LE_018() {

    fun calculamH(nota1: Double, nota2: Double, nota3: Double): Double {
        return 3 / (1 / nota1 + 1 / nota2 + 1 / nota3)
    }

    println("Informe a nota 1")
    val nota1 = readln().toDouble()

    println("Informe a nota 2")
    val nota2 = readln().toDouble()

    println("Informe a nota 3")
    val nota3 = readln().toDouble()

    val mH = calculamH(nota1, nota2, nota3)

    println("A média hamônica das notas é %.2f".format(mH))
}