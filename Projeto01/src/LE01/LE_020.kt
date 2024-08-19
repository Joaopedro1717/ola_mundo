package LE01

fun LE_020() {

    fun calcConsumo(tempo: Double, velocidadeMedia: Double): Double{
        val distancia = tempo * velocidadeMedia
        val consumo = distancia/12
        return consumo
    }

    print("Informe o tempo da viagem em horas")
    val tempo = readln().toDouble()

    print("Informe a velocidade média da viagem")
    val velocidadeMeida = readln().toDouble()

    val combustivelGasto = calcConsumo(tempo, velocidadeMeida)

    print("A quantidade gasta de combustível na viagem é de: %.2f litros".format(combustivelGasto))
}