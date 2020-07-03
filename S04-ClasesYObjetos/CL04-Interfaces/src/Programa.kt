fun main(args: Array<String>) {
    val miVehiculo = Vehiculo("Ferrari", 200f)
    miVehiculo.acelerar(300f)
    miVehiculo.frenar(40f)

}

interface IVehiculoMotor {
    val modelo: String
    val velocidadMaxima: Float
    fun acelerar(incremento: Float)
    fun frenar(decremento: Float)
}

class Vehiculo(override val modelo: String, override val velocidadMaxima: Float): IVehiculoMotor {
    var velocidadActual = 0f

    override fun acelerar(incremento: Float) {
        if(velocidadActual + incremento > velocidadMaxima)
            velocidadActual = velocidadMaxima
        else
            velocidadActual += incremento

        println("Acelerar a: $velocidadActual")
    }

    override fun frenar(decremento: Float) {
        if(velocidadActual - decremento < 0f)
            velocidadActual = 0f
        else
            velocidadActual -= decremento

        println("Frenar a: $velocidadActual")
    }
}