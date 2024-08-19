package LE01

fun LE_008() {
        println("Informe um número qualquer")
        val input = readln()
        val number = input.toIntOrNull()

        if(number != null){
            if(number >= 50){
                println("Seu número é igual ou maior que 50")
            } else {
                println("Seu numero é menor que 50")
            }
        }
}