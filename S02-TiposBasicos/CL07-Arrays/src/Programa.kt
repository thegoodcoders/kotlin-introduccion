fun main(args: Array<String>) {

    //                        Posiciones: 0,1,2,3,4,...
    val arrayPares: IntArray = intArrayOf(0,2,4,6,8)
    println(arrayPares[1])

    val arrayImpares: IntArray = IntArray(10)
    println(arrayImpares[5])

    val arrayImparesV2: IntArray = IntArray(5) { 1 }
    println(arrayImparesV2[3])
    println(arrayImparesV2[2])

    val arrayImparesV3: IntArray = IntArray(5) { it * 3 }
    println("Numeros potencias de 3: ")
    println(arrayImparesV3[0])
    println(arrayImparesV3[1])
    println(arrayImparesV3[2])

}