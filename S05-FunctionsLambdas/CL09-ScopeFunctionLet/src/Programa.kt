fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 25)
    val persona2 = Persona("Victoria", 20)

    persona1.let { personaModificada ->
        personaModificada.edad += 1
        "${personaModificada.nombre} tiene ${personaModificada.edad} años"
    }.println()

    persona1.imprimirPersona()

}

data class Persona(var nombre: String, var edad: Int) {
    fun imprimirPersona() = println("$nombre, $edad años")
}

fun String.println() = println(this)