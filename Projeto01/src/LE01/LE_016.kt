package LE01

fun LE_016() {

    println("Informe a nota 1: ")
    var nota1 = readln().toDouble()

    println("Informe a nota 2: ")
    var nota2 = readln().toDouble()

    println("Informe a nota 3: ")
    var nota3 = readln().toDouble()

    var mA = (nota1 + nota2 + nota3) / 3

    println("Média aritimética %.2f".format(mA))
}