import br.escuderodev.diobank.models.ContaCorrente

fun main() {
    val contaCorrente: ContaCorrente = ContaCorrente("0001", "85040-8")

    println()
    contaCorrente.deposito(1000.0)
    contaCorrente.deposito(500.0)
    contaCorrente.saque(258.93)

    println()
    contaCorrente.extrato()
}