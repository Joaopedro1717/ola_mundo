package LE02

fun LE2_09() {
    val vetorA = IntArray(5)
    val vetorB = IntArray(5)

    for(i in vetorA.indices){
        print("Digite o número da posição $i do vetorA: ")
        vetorA[i] = readln().toInt()
    }

    for(i in vetorB.indices){
        print("Digite o número da posição $i do vetorB: ")
        vetorB[i] = readln().toInt()
    }

    val vetorC = IntArray(5)

    for(i in vetorC.indices){
        if(i % 2 == 0) {
            vetorC[i] = vetorA[i]
        } else {
            vetorC[i] = vetorB[i]
        }
    }

    print("O vetor C gerado é: ")
    for (i in vetorC.indices) {
        print("${vetorC[i]}")
    }
}