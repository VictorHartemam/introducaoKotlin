package br.edu.ifsp.scl.introducaokotlin

fun main(){
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Mae", "Ana"),
        Pair("Filho", "Vandercleison"),
        Pair("Caçula", "Geronimo"),
        Pair("Pet", "Pupi")
    )

    familiaMap.forEach { println("${it.key}: ${it.value}")}
}