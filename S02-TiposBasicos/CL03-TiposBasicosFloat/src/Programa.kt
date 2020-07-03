fun main(args: Array<String>) {

    var operando1: Float
    var operando2: Float

    operando1 = 4.5f
    operando2 = 12.2f

    var resultado: Float = sumaFloat(operando1, operando2)
    println("Suma = " + resultado)

    // Double

    var operando3: Double
    var operando4: Double

    operando3 = 5.5
    operando4 = 12.5

    var resultadoSuma: Double = sumaDouble(operando3, operando4)
    println("Suma Double = " + resultadoSuma)
}

fun sumaDouble(operando3: Double, operando4: Double): Double {
    return operando3 + operando4
}

fun sumaFloat(operando1: Float, operando2: Float): Float {
    return operando1 + operando2
}
