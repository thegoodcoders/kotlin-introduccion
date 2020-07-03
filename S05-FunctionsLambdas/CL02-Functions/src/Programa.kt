fun main(args: Array<String>) {
    println(sumar(4, 5))

    // Usando el valor y por defecto
    println(sumar(4))

    // Usando el valor x por defecto
    println(sumar(y = 6))
}

fun sumar(x: Int = 1, y: Int = 0): Int {
    return x+y
}