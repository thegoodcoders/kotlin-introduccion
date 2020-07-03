fun main(args: Array<String>) {

    val persona = Persona("María", 30)
    // Destructuring Declaration

    val (n, e) = persona
    println("Nombre $n y Edad $e")

}

data class Persona(val nombre: String, val edad: Int)