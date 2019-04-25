package br.edu.ifsp.scl.introducaokotlin

fun main(){
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desenvolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    //println(listaCursos)

    val listaCursoSistemas = listaCursos.filter { it.contains("Sistemas") }

    listaCursoSistemas.withIndex().forEach { println("${it.index} - ${it.value}")}

    //listaCursos.forEach({ if (it.contains("Sistemas")){println(it)} })

}