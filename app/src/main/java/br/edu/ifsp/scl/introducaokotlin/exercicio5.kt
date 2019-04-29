package br.edu.ifsp.scl.introducaokotlin

// Funcoes de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int {
    return f(i)
}

fun processaInteiros(i: Int, j:Int, f:(Int, Int) -> Int): Int{
    return f(i,j)
}

// Funcoes
fun somaa(i:Int, j:Int): Int{
    return i+j
}

fun multiplica(i:Int,j:Int):Int{
    return i*j
}

fun raizQuadrada(numero:Int):Int{
    for(n in 1..numero){
        if(n*n == numero){
            return n
        }
    }

    return -1;
}

// Funcao Main
fun main(){
    // 1. Chamadas do primeiro passo
    println( processaInteiros(2,3, ::somaa) )
    println( processaInteiros(2,3, ::multiplica) )
    println( processaInteiro(4, ::raizQuadrada) )
    println( processaInteiro(2, ::raizQuadrada) )

    // 2. Chamadas do segundo passo
    println( processaInteiros(2,3) {x:Int, y:Int -> x+y} )
    println( processaInteiros(2,3, fun(i:Int, j:Int):Int{return i*j}) )
    print( processaInteiro(4, fun (numero:Int):Int {
        for(n in 1..numero){
            if(n*n == numero){
                return n
            }
        }

        return -1
    }) )
}