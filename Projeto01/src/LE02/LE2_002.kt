package LE02

fun LE2_02() {

    val numeros = mutableListOf<Double>()

    println("Digite os números (Digite 'sair' para finalizar):")
    while (true) {
        val input = readln()
        if(input.lowercase() == "sair") break
        numeros.add(input.toDouble())
    }

    println("Você digitou os seguintes números: ")
    for (i in numeros.indices) {
        val numero = numeros[i]
        val tipo = if (numero >= 0) "positivo" else "negativo"
        println("Posição $i: $numero ($tipo)")

    }



}