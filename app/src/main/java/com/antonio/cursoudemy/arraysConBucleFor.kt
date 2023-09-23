package com.antonio.cursoudemy

fun main() {
    var recibos: Array<String> = arrayOf("luz","agua","gas")
    recibos.set(1,"internet")  //modificar un array
    recorrerArray(recibos)
}

fun recorrerArray(recibos: Array<String>) {
    for (i in recibos) println(i)

    for (i in recibos.indices) println(recibos.get(i))

    for (i in 0 .. recibos.size -1) println("${i+1}: ${recibos[i]}")

}
