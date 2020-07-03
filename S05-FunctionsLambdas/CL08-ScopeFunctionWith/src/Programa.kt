fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 25)
    val persona2 = Persona("Victoria", 20)

    with(persona1) {
        edad += 1
        nombre = "Juanito"
        "$nombre tiene ahora $edad años"
    }.println()

}

data class Persona(var nombre: String, var edad: Int) {
    fun imprimirPersona() = println("$nombre, $edad años")
}

fun String.println() = println(this)