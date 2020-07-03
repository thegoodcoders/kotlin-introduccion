fun main(args: Array<String>) {

    val persona = Persona("María", 30)
}

class Persona (private val nombre: String, private val edad: Int) {

    init {
        println("La Persona $nombre ha sido creada")
    }
}