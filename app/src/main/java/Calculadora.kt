class Calculadora {

    fun  sun(a: Double, b: Double): Double = a + b

    fun  subtract(a: Double, b: Double): Double = a - b

    fun multuply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double  {
        if (b == 0.0) throw IllegalArgumentException("Divisao por zero nao pode....")
        return a / b
    }
}