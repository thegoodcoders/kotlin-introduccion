fun main(args: Array<String>) {

    imprimirSaludo(null)

}

fun imprimirSaludo(nombre: String?): Unit {
    if (nombre != null)
        println("Hola $nombre!")
    else
        println("Hola desconocido!")

    // return Unit
}
