package br.edu.ifsp.scl.introducaokotlin

fun <T, U, V>xpto(x: T, y: U, f: (T, U) -> V) : V = f(x, y)

fun concat(x: Int, y: Int): Int = x + y
fun concat(x: String, y: String): String = "${x}${y}"
fun concat(x: Int, y: String): String = "${x}${y}"
fun concat(x: String, y: Int): String = "${x}${y}"

fun main(){
    println(xpto(1,2, ::concat))
    println(xpto("1","2", ::concat))
    println(xpto(1,"2", ::concat))
    println(xpto("1",2, ::concat))
}
