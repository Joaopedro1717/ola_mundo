package LE02

fun LE2_03() {

    val numeros = mutableListOf<Double>()

    println("Digite os números(Digite 'sair' para finalizar):")
    while (true) {
        val input = readln()
        if(input.lowercase() == "sair") break
        numeros.add(input.toDouble())
    }

    val numerosDobro = numeros.map { it * 2}

    println("Valores do vetor com o dobro dos números digitados:")
    for((index, valor) in numerosDobro.withIndex()) {
        println("Posição $index: $valor")
    }

}