fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 25)
    val persona2 = Persona("Victoria", 20)

    persona2.apply {
        edad = 30
        nombre = "María"
    }.imprimirPersona()

    persona2.edad = 30
    persona2.nombre = "María"
    persona2.imprimirPersona()

}

data class Persona(var nombre: String, var edad: Int) {
    fun imprimirPersona() = println("$nombre, $edad años")
}

fun String.println() = println(this)