package LE02

fun LE2_07() {

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

    var saoIguais = true
    for(i in vetor1.indices) {
        if(vetor1[i] != vetor2[i]) {
            saoIguais = false
            break
        }
    }

    if(saoIguais) {
        println("Os vetores são iguais")
    } else {
        println("Os vetores são diferentes")
    }


}