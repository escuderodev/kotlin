enum class State {
    SP, RJ, MG, RS, SC
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val uf = State.SP

    val message = when (uf) {
        State.SP -> "São Paulo"
        State.MG -> "Minas Gerais"
        State.RJ -> "Rio de Janeiro"
        State.RS -> "Rio Grande do Sul"
        State.SC -> "Santa Catarina"
    }

    println(message)

    println()
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}