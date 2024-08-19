package LE02

fun LE2_01() {

    val numeros = DoubleArray(5)

    for (i in numeros.indices) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readln().toDouble()
    }

    val media = numeros.average()

    println("A média dos números é: $media")

    for(numero in numeros) {
        when{
            numero < media -> println("$numero é menor que a média")
            numero == media -> println("$numero é igual a média")
            else -> println("$numero é maior que a média")
        }
    }
}