package br.edu.ifsp.scl.introducaokotlin

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun foo(i1: Int, i2: Int, f: (Int, Int) -> Int): Int{
    return f(i1, i2)
}

fun bar(s1: String, s2:String, f: (String, String) -> String):String {
    return f(s1, s2)
}

fun main(){
    println(foo(10, 20, ::soma))
    println(bar("Vic", "tor", ::cat))
}