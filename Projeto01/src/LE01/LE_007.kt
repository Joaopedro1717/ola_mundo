package LE01

fun LE_007() {
    println("Informe um número ")
    val input = readln()
    val number = input.toIntOrNull()

    if(input != null){
        if(number in 100..200){
            println("Este numero esta no intervalo de 100 a 200")
        } else {
            println("Seu numero não esta entre 100 e 200")
        }
    }
}