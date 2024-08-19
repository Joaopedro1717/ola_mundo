package LE01

fun LE_009() {

    println("Digite o primeiro número")
    val inputA = readln()
    val a = inputA.toIntOrNull()

    println("Informe o segundo número")
    val inputB = readln()
    val b = inputB.toIntOrNull()

    when {
        a == null || b == null -> println("Entrada invalida")
        a == b -> println("Numero iguais")
            else -> {
                println("Os números são diferentes")
                    when {
                        a > b -> println("O número $a é maior  que o número $b")
                        else -> println("O numero $b é maior que o numero $a")
                    }
            }
    }
}