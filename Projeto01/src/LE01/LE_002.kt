package LE01

fun LE_002() {
       println("Informe um número")

       val value1 = readLine()

       println("Informe outro numero")

       var value2 = readLine()

       val input1 = value1?.toIntOrNull()
       val input2 = value2?.toIntOrNull()

       if(input1 != null && input2 != null){
           val soma = input1 + input2
           println(soma)
       }
}