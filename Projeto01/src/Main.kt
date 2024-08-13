/*

val valor1: Int = 100
val valor2: Int = 50

val dec1: Double = 100.00
val dec2: Double = 50.00

var pratos = 100
var copos = 50

fun main1(){
    println("Olá Mundo!")
    var nome : String = "João"
    var sem_tipo = "João"

    val NAME = "Kotlin"
    // val colocar em maiusculo
    println("A linguagem é " + NAME)
    println("A linguagem é ${NAME}" + " Hey")
    println(nome)
    println(sem_tipo)
}

//Inteiros e decimais
fun main2() {
    //inteiros
    println("Resultado soma ${valor1 + valor2}")
    println("Resultado subtraçãa ${valor1 - valor2}")
    println("Resultado multiplicação ${valor1 * valor2}")
    println("Resultado divisão ${valor1 / valor2}")

    //decimais
    println("Resultado soma ${dec1 + dec2}")
    println("Resultado subtraçãa ${dec1 - dec2}")
    println("Resultado multiplicação ${dec1 * dec2}")
    println("Resultado divisão ${dec1 / dec2}")
}

fun main3() {
    println("Informe o número de pratos!!")
    pratos = readLine()!!.toInt()
    println("Informe o númeoro de copos")
    copos - readLine()!!.toInt()
    if(pratos > copos) {
        println("Há mais pratos...")
    } else {
        println("Há mais copos...")
    }
}

fun main4() {
    val numero = 20
    if (numero in 1..30){
        println("Alunos $numero")
    }
    when(numero) {
        20 -> println("Número igual")
        in 1..30 -> println("Número na faixa")
        else -> println("Não achou correspondência")
    }
}
*/
fun main() {
    println("Informe um número " )

    val input = readLine()

    if (input > 10){
        println("Número maior que 10")
    } else ("Número maior ou igual a 10")
}






//#1

