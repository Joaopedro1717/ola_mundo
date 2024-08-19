package LE01

fun LE_017() {

    println("Informe a nota 1")
    val n1 = readln().toDouble()

    println("Informe o peso referente a nota 1")
    val p1 = readln().toDouble()

    println("Informe a nota 2")
    val n2 = readln().toDouble()

    println("Informe o peso referente a nota 2")
    val p2 = readln().toDouble()

    println("Informe a nota 3")
    val n3 = readln().toDouble()

    println("Informe o peso referente a nota 3")
    val p3 = readln().toDouble()

    val mP = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3)

    println("Média ponderada %.2f".format(mP))
}