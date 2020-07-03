fun main(args: Array<String>) {

    // val nombreExpresionLambda : Type = { listaArgumentos -> cuerpoFunction }

    // Expresión lambda que recibe 1 parámetro
    println(calcularDoble(4))

    // EXpresión lambda que recibe 2 parámetros
    println(multiplicar(2,3))

    // Expresión lambda sin resultado
    imprimirNombre("María")

    // Expresión que devuelva un return en función de una expresión
    println(notaExamen(8))
}

val calcularDoble = { numero: Int -> numero * 2 }

val multiplicar: (Int, Int) -> Int = { x,y -> x * y }

val imprimirNombre: (String) -> Unit = {
    nombre -> println("Hola $nombre")
}

val notaExamen: (Int) -> String = {
    when(it) {
        in 0..4 -> "Suspenso"
        in 5..6 -> "Bien"
        in 7..8 -> "Notable"
        else -> "Sobresaliente"
    }
}

