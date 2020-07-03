fun main(args: Array<String>) {

    // No  se va a cargar un objeto de tipo Persona
    // en tiempo de ejecución la variable "persona" va a contener es directamente el String
    val persona = Persona("María")

    println(persona)

}

inline class Persona(val nombre: String)