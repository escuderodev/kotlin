import kotlin.reflect.typeOf

fun main() {

    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3
    println(b)
    println(c)

//    var é variável mutável e val é semelhante a constante, pois é imutável
//    toda variável deve ser inicializada a não ser que façamos alguma validação antes de inserir valores
    var anoDeNascimento: Int = 1984
    var anoAtual: Int = 2024
    var maiorDeIdade: Boolean

        if ((anoAtual - anoDeNascimento) >= 18) {
            maiorDeIdade = true
        } else {
            maiorDeIdade = false
        }
    println(maiorDeIdade)
}