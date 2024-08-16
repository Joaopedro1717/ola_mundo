package LE01

fun LE_011() {
    var i : Int = 0
    val numbers = Array(3) { 0 }
    while ( i < 3) {
        println("Digite ${i +1}° número")
        var input = readln().toInt()
        numbers[i] = input
        i++
    }

    numbers.sort()

    println("Números em ordem crescente: ${numbers.joinToString(", ")}")
}