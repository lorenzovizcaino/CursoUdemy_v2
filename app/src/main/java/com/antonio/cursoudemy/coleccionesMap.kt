package com.antonio.cursoudemy

fun main() {

    //Map Inmutable
    var mapa:Map<Int,String> = mapOf(
        1 to "España",
        2 to "Mexico",
        3 to "Colombia"

    )
    println(mapa)

    //Map mutable
    var inversiones = mutableMapOf<String, Float>()
    inversiones.put("Coca-Cola", 50f)
    println(inversiones)


}