fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 25)
    val persona2 = Persona("Victoria", 20)

    persona2.also { p ->
        p.edad = 30
        p.nombre = "María"
    }.imprimirPersona()
}

data class Persona(var nombre: String, var edad: Int) {
    fun imprimirPersona() = println("$nombre, $edad años")
}

fun String.println() = println(this)