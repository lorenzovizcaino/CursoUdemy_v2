package com.antonio.cursoudemy

fun main() {

    val fecha="05/01/1990"
    var nombre="jota"
    val mes=fecha.substring(3,5).toInt()

    nombre="Adrian"
    println("Hola $nombre")

    when(mes){
        1-> println("ENERO")
        2-> println("FEBRERO")
        in 3..6 -> println("Primavera")
        7,8 -> println("Verano")
        else -> println("La fecha es erronea")
    }


    var pin:Int=1234
    var intentos:Int=0
    var clave_ingresada=1230

    do{
        println("Ingrese el PIN")
        println("Clave ingresada: ${clave_ingresada++}")
        if(clave_ingresada==pin) break
        intentos++
    }while (intentos<3 && clave_ingresada != pin)
    if (intentos==3) println("tarjeta bloqueada")
}

