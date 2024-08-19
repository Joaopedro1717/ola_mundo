package LE01

fun LE_004() {
        println("Informe um número")
        val A = readLine()

        println("Informe outro número")
        val B = readLine()

        val a = A?.toIntOrNull()
        val b = B?.toIntOrNull()

        if(a != null && b != null){
            println("""Soma ${a + b}
                |Subtração ${a - b}
                |Multiplicação ${a * b}
                |Divisão ${a.toDouble() / b.toDouble()}
            """.trimMargin())
        }
}