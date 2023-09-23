package com.antonio.cursoudemy

fun main() {
    var clientesVip: Set<Int> = setOf(1234, 5678, 4040)
    val setMezclado = setOf(2, 4.054, "casa", 'c')   //si no especificas el tipo puedes mezclar diferentes tipos de datos



    println("Clientes VIP\n")
    println(clientesVip)
    println("Numero de Clientes VIP: ${clientesVip.size}")
    if(clientesVip.contains(1234)) println("1234 es VIP")



}