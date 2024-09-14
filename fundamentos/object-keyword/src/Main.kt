//implementando object-keyword com pathern singleton
class Calculadora {
    companion object {
        fun somar(num1: Int, num2: Int): Int {
            return num1 + num2
        }

        fun subtrair(num1: Int, num2: Int): Int {
            return num1 - num2
        }

        fun multiplicar(num1: Int, num2: Int): Int {
            return num1 * num2
        }

        fun dividir(num1: Int, num2: Int): Double {
            return (num1 / num2).toDouble()
        }
    }
}

fun main() {
    val soma = Calculadora.somar(2,1)
    val subtracao = Calculadora.subtrair(2,1)
    val multiplicacao = Calculadora.multiplicar(2,1)
    val divisao = Calculadora.dividir(4,2)
    println("Resultado da Soma: $soma")
    println("Resultado da Subtração: $subtracao")
    println("Resultado da Multiplicação: $multiplicacao")
    println("Resultado da Divisão: $divisao")
}