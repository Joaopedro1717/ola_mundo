package LE02

fun LE2_04() {

    val numeros = IntArray(5)

    for (i in numeros.indices) {
        print("Digite um número para a posição $i: ")
        numeros[i] = readln().toInt()
    }

    print("Digite um valor n")
    val n = readln().toInt()

    println("Indices dos elementos inferiores a $n:")
    for(i in numeros.indices) {
        if (numeros[i] < n) {
            print(i)
        }
    }
}