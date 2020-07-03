fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 25)
    val persona2 = Persona("Victoria", 20)

    val personaMayor = if(persona1.edad >= persona2.edad) persona1 else persona2
    personaMayor.imprimirPersona()

    // Optimización con run
    run {
        if(persona1.edad >= persona2.edad) persona1 else persona2
    }.imprimirPersona()
}

data class Persona(var nombre: String, var edad: Int) {
    fun imprimirPersona() = println("$nombre, $edad años")
}

fun String.println() = println(this)