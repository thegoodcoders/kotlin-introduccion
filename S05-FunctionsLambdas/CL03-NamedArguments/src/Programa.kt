fun main(args: Array<String>) {

    setDatosPersona(
            nombre = "Miguel",
            apellidos =  "Campos",
            tieneTrabajo = true
    )

}

fun setDatosPersona(nombre: String, edad: Int = 0, apellidos: String, tieneTrabajo: Boolean) {
    println("Nombre: $nombre $apellidos, edad: $edad")
}