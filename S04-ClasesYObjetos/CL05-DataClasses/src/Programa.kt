fun main(args: Array<String>) {

    val persona = Persona("María", 30)
    println(persona)

    val copia = persona.copy(edad = 25)
    println(copia)

    val personaVacia = Persona()
    println(personaVacia)

}

data class Persona(val nombre: String = "", val edad: Int = 0)