package LE01

fun LE_013() {

    print("Informe um valor real")
    var inputA = readln().toDouble()

    print("Informe outro valor real")
    var inputB = readln().toDouble()

    print("Informe um tipo de operação: '+', '-', '*', '/'")
    var opType = readln().trim()

    if(opType != null && opType.length == 1) {
        when (opType[0]) {
            '+' -> println("Resultado: ${inputA + inputB}")
            '-' -> println("Resultado: ${inputA - inputB}")
            '*' -> println("Resultado: ${inputA * inputB}")
            '/' -> {
                if (inputB != 0.0) {
                    println("Resultado: ${inputA / inputB}")
                } else {
                    println("Não é possível dividir por zero.")
                }
            }
            else -> println("Operação inválida")
        }
    } else {
        println("Operador inválido")
    }
}