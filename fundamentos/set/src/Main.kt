//sets não são ordenados e não permitem duplicados

val nomes: MutableSet<String> = mutableSetOf("Eduardo", "Carol", "Juan", "Alicia")
val cidades: Set<String> = setOf("São Paulo", "Rio de Janeiro", "Araçatuba")

fun addNome(nome: String): Boolean {
    return nomes.add(nome)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly" else "not registered correctly"
}

fun main() {
    println(nomes)
    println(cidades)

    val isAdded = addNome("Valmir")
        println(nomes)
    //    cidades.add("Suzano") -> erro

    println(getStatusLog(isAdded))
}