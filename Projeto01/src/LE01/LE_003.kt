package LE01

fun LE_003() {
    println("Informe um número")

    val a = readLine()

    println("Informe outro numero")

    val b = readLine()

    val a1 = a?.toIntOrNull()
    val b1 = b?.toIntOrNull()

    if(a1 != null && b1 != null) {
        if (a1 == b1) {
            println("Sequência de números inválida")
        } else if (a1 > b1) {
            println("O maior número é $a1")
        } else {
            println("O maior número é $b1")
        }
    }   else {
        println("Entrada invalida, informe numeros válidos")
    }
}