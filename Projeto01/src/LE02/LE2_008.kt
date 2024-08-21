package LE02

fun LE2_08() {

    val vetorA = IntArray(5)
    val vetorB = IntArray(5)

    for(i in vetorA.indices){
        print("Digite um número para a posição $i do vetorA: ")
        vetorA[i] = readln().toInt()
    }

    for(i in vetorB.indices){
        print("DIgite um número para a posição $i do vetorB: ")
        vetorB[i] = readln().toInt()
    }

    val vetorC = IntArray(10)

    for(i in vetorA.indices) {
        vetorC[i] = vetorA[i]
    }

    for(i in vetorB.indices){
        vetorC[i + 5] = vetorB[i]
    }

    print("O vetor C (concatenação de A e B) é: ")
    for(i in vetorC.indices) {
        print("${vetorC[i]} ")
    }


}