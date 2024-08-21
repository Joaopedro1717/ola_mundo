package LE02

fun LE2_06() {
    val notas = DoubleArray(5)
    val pesos = DoubleArray(5)


    for(i in notas.indices) {
        print("Digite a nota ${i + 1}: ")
        notas[i] = readln().toDouble()
    }

    for(i in pesos.indices) {
        print("Digite o peso da nota ${i + 1}: ")
        pesos[i] = readln().toDouble()
    }

    var somaNotasxPesos = 0.0
    var somaPesos = 0.0

    for(i in notas.indices) {
        somaNotasxPesos += notas[i] * pesos[i]
        somaPesos += pesos[i]
    }

    val mP = if (somaPesos != 0.0) somaNotasxPesos/somaPesos else 0.0

    print("A média ponderada do aluno é: $mP")
}