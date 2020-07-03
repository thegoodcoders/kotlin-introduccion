fun main(args: Array<String>) {
    val saludo = "Hola mundo"
    // Método habitual para imprimir un String, pasado por parámetro
    println(saludo)

    // Extension function
    saludo.printLine()
}

fun String.printLine() = println(this)