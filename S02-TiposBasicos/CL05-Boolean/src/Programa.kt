fun main(args: Array<String>) {

    val llueve: Boolean = true
    val nublado: Boolean = true
    val haceFrio: Boolean = true

    // OR - disyunción
    if(llueve || haceFrio) {
        println("No voy a salir a pasear")
    }

    // AND - conjunción
    if(nublado && haceFrio) {
        println("Seguramente llueva")
    }

    // NOT - negación
    if(!llueve) {
        println("No necesito el paraguas")
    }
}