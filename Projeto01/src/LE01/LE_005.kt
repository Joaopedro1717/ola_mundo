package LE01

fun LE_005() {
            println("Insira um valor")
            var a = readln()

            println("Insira outro valor")
            var b = readln()
            // Exibindo os valores originais
            println("Valores originais:")
            println("A = $a")
            println("B = $b")

            // Troca dos valores utilizando desestruturação
            a = b.also { b = a }

            // Exibindo os valores trocados
            println("Valores trocados:")
            println("A = $a")
            println("B = $b")
}