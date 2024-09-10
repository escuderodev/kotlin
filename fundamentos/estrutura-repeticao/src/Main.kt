fun main() {
    val names = listOf("Eduardo", "Carol", "Juan", "Alícia")

    for (name in names) {
        println("O nome é $name")
    }

    val multiplicador: Int = 2
    var contador: Int = 0

    while (contador <= 10) {
        println("$multiplicador x $contador = ${multiplicador * contador}")
        contador++
    }

    do {
        println(contador)
        contador--
    } while (contador >= 0)
}