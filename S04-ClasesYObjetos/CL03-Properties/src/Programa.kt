fun main(args: Array<String>) {
    val miVehiculo = Vehiculo()
    println("${miVehiculo.modelo} ${miVehiculo.precio}$")

    miVehiculo.propietario = "Miguel Campos"
    println("${miVehiculo.propietario}")

    println("${miVehiculo.esMuyCaro}")

    miVehiculo.caracteristicas = "200CV motor v8"

    println("El id de ${miVehiculo.modelo} = ${miVehiculo.id}")
}

class Vehiculo {
    // Inmutable (no puede cambiar de valor)
    val modelo = "Ferrari"

    // Mutable (puede sufrir modificaciones
    var precio = 200000f

    lateinit var propietario: String

    val esMuyCaro: Boolean
        get() = precio > 300000f

    var caracteristicas: String = ""
        set(value) {
            field = value
            println("Se han modificado las características del $modelo")
        }

    var id = 10
        private set

    init {
        this.id = 5
    }
}