import java.math.BigDecimal

fun strLength(str: String?): Int {
    return str?.length ?: 0;
}

fun main() {

    var nome: String = "not null"
    var salary: BigDecimal = BigDecimal(0.00)
    var nullable: String? = null

    println(strLength("teste"))
    println(strLength(null))
}