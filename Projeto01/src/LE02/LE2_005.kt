package LE02

fun LE2_05() {

    val vetor = IntArray(5)

    for(i in vetor.indices) {
        print("Digite 5 números: ")
        vetor[i] = readln().toInt()
    }

    print("Digite um valor n: ")
    val n = readln().toInt()

    var count = 0
    for(numero in vetor){
        if(numero == n) {
            count++
        }
    }

    println("O número $n aparece $count vez(es) no vetor")
}