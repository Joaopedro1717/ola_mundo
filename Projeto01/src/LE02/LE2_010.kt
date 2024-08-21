package LE02

fun LE2_010() {

    val vetorA = IntArray(5)
    val vetorB = IntArray(5)

    for(i in vetorA.indices) {
        print("Digite o elemento ${i + 1} do vetorA: ")
        vetorA[i] = readln().toInt()
    }

    for(i in vetorA.indices) {
        vetorB[i] = vetorA[vetorA.size - 1 - i]
    }

    println("O vetorB, invertido, é:")
    for (i in vetorB.indices) {
        print("${vetorB[i]}")
    }
}