package com.antonio.cursoudemy

//fun main() {
//    var contador=9
//    do{
//        println(contador)
//        contador--
//
//    }while(contador>-1)
//
//}

//fun main() {
//    var contador=1;
//    while (contador<=10){
//        if(contador%2==0){
//            println(contador)
//        }
//        contador++
//    }
//}

//fun main() {
//    var comida:Array<String>  = arrayOf("Tortilla", "Lubina", "Solomillo", "Paella")
//    for (i in comida) println(i)
//}


//fun main() {
//    var comida:Map<String, Double> = mapOf(
//        "Tortilla" to 11.20,
//        "Lubina" to 18.90,
//        "solomillo" to 22.90,
//        "Paella" to 11.45
//    )
//
//    for (i in comida){
//        println(i)
//    }
//
//}

fun main() {
    var comida:Map<String, Double> = mapOf(
        "Tortilla" to 11.20,
        "Lubina" to 18.90,
        "solomillo" to 22.90,
        "Paella" to 11.45
    )


    val ingredientesTortilla:Array<String> = arrayOf("Patatas", "Huevos", "Cebolla")
    val ingredientesLubina:Array<String> = arrayOf("Lubina", "Patatas", "Cebolla","Tomate", "Pimiento")
    val ingredientesSolomillo:Array<String> = arrayOf("Solomillo Ternera", "Patatas", "Cebolla", "Sal")
    val ingredientesPaella:Array<String> = arrayOf("Arroz", "Pollo", "Marisco","Caldo", "Sal")


    val platos: Map<Map.Entry<String, Double>, Array<String>> = mapOf(
        comida.entries.elementAt(0) to ingredientesTortilla,
        comida.entries.elementAt(1) to ingredientesLubina,
        comida.entries.elementAt(2) to ingredientesSolomillo,
        comida.entries.elementAt(3) to ingredientesPaella


    )

    for (i in 0..platos.size-1){
        var numIngredientes=platos.values.elementAt(i).size
        println("${platos.keys.elementAt(i)} €")
        println("Ingredientes:")
        for(j in 0..numIngredientes-1){
            println("\t${j+1} ${platos.values.elementAt(i).get(j)}")
        }
        println()

    }

}