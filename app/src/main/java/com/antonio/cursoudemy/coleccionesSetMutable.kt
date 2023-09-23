package com.antonio.cursoudemy

fun main() {
    var clientes : MutableSet<Int> = mutableSetOf(1234, 5678, 4040, 8970)
    println("Clientes:")
    println(clientes)
    println()

    clientes.add(3476)
    println("Clientes:")
    println(clientes)
    println()

    clientes.remove(5678)
    println("Clientes:")
    println(clientes)
    println()

    clientes.clear()
    println("Clientes:")
    println(clientes)
    println()

    println("Numero de Clientes: ${clientes.size}")
}