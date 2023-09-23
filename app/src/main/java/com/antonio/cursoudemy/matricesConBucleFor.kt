package com.antonio.cursoudemy

fun main() {
    var matriz= arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6,7,8,9,10),
        intArrayOf(11,12,13,14)
    )
    println(matriz[1][2])

    for (i in (0 until matriz.size)) {
        for (j in (0 until matriz[i].size)){
            println("La posicion [$i][$j] es= ${matriz[i][j]}")
        }
    }



}