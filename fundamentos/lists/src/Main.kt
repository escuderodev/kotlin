//listOf -> sempre criará uma lista imutável
//mutableListOf -> sempre criará uma lista mutável
val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers //criando cópia de leitura da referencia systemUsers

fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUsers(9)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }

    val nomes: MutableList<String> = mutableListOf("Eduardo", "Carol")
    val idades: List<Int> = listOf(40,41)
    println(nomes)
    println(idades)
    nomes.add("Juan")
//    idades.add(10) -> erro
    println(nomes)
    println(idades)
}