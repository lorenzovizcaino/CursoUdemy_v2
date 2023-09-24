package com.antonio.cursoudemy

fun main() {
    var bolsa:MutableList<String> = mutableListOf("Coca-Cola", "Adidas", "Amazon", "Pfizer")
    var inversiones = mutableMapOf<String, Float>()
    var contador=0
    var saldo=501f
    val cantidadInvertir=100f
    var cantidadExistente=0f

    for (i in bolsa){
        inversiones.put(i,50f)
    }

    //println(inversiones)

    //se hace una inversion en cada empresa de la lista
    while(contador<bolsa.size){
        inversiones.put(bolsa[contador],cantidadInvertir)
        println("Se ha invertido la cantidad de $cantidadInvertir€ en la empresa ${bolsa[contador]}")
        contador++
    }
    //println(inversiones)

    //se hacen inversiones en las empresas de la lista mientras haya saldo en cuenta
    contador=0
    while(saldo>=cantidadInvertir){
        if(contador>bolsa.size-1){
            contador=0;
        }else{
            cantidadExistente=inversiones.getValue(bolsa[contador])
            inversiones.put(bolsa[contador], cantidadExistente+cantidadInvertir)
            println("Se ha invertido la cantidad de $cantidadInvertir€ en la empresa ${bolsa[contador]}")
            contador++
            saldo-=cantidadInvertir
        }
    }
    println(inversiones)
    println("Saldo actual en cuenta= $saldo")
}