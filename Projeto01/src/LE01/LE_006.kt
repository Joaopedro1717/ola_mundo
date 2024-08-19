package LE01

fun LE_006() {
            println("Informe uma temperatura em graus Celsius:")

            // Lê a entrada do usuário
            val input = readln()

            // Converte a entrada para Double e verifica se a conversão foi bem-sucedida
            val celsius = input.toDoubleOrNull()

            if (celsius != null) {
                // Calcula a temperatura em Fahrenheit
                val fahrenheit = (celsius * 9 / 5) + 32

                // Exibe o resultado
                println("Temperatura em graus Fahrenheit: $fahrenheit")
            } else {
                // Mensagem de erro caso a entrada não seja um número válido
                println("Entrada inválida. Por favor, digite um número válido.")
            }
}