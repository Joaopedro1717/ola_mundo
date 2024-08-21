package LE02

fun LE2_11() {
    var vetor1 = IntArray(5)
    var vetor2 = IntArray(5)

    for(i in vetor1.indices){
        print("Digite um número para a posição $i do vetor1: ")
        vetor1[i] = readln().toInt()
    }

    for(i in vetor2.indices){
        print("Digite um número para a posição $i do vetor2: ")
        vetor2[i] =  readln().toInt()
    }

    var produtoEscalar = 0
    for(i in vetor1.indices){
        produtoEscalar += vetor1[i] * vetor2[i]
    }

    println("O produto escalar entre os dois vetores é: $produtoEscalar")
}