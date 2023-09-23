package com.antonio.cursoudemy

fun main() {

    //Inmutable List
    var divisas:List<String> = listOf("USD", "EUR", "YEN")
    println(divisas)
    recorrerLista(divisas)


    //Mutable List
    var bolsa:MutableList<String> = mutableListOf("Coca-Cola", "Adidas", "Amazon", "Pfizer")
    println(bolsa)
    bolsa.add("Adobe")
    println(bolsa)
    bolsa.add("Nvidia")
    println(bolsa)

    bolsa.removeAt(2) //eliminar por indice
    bolsa.remove("Adobe") //eliminar por elemento
    println(bolsa)

    println(bolsa.first())
    println(bolsa.last())
    println(bolsa.elementAt(2))
    println(bolsa.none())  //nos devuelve false mientras haya datos, true si esta vacia
    println(bolsa)

    bolsa.clear() //vaciar la lista
    println(bolsa.none())  //nos devuelve false mientras haya datos, true si esta vacia
    println(bolsa)
    println(bolsa.firstOrNull()) //devuelve el primero o un null

    if(bolsa.isEmpty()) println("La lista esta vacia")
}

fun recorrerLista(divisas: List<String>) {
    for (i in divisas) println(i)

    for(i in 0..divisas.size-1){
        println("el valor $i es ${divisas[i]}")
    }
}
