package br.escuderodev.diobank.models

class ContaCorrente(agencia: String, numero: String): Conta(agencia = agencia, numero = numero) {

    override fun saque(valor: Double) {
        super.saque(valor)
        val taxaDeSaque: Double = 5.00
        val valorARetirar: Double = valor + taxaDeSaque
        println("valorARetirar R$ $valorARetirar")

        if (saldo >= valorARetirar) {
            saldo -= valorARetirar
            movimentacao.add("- Saque R$ $valorARetirar")
            println("Saque no valor de R$ $valorARetirar realizado com sucesso!")
            println("Novo saldo da conta $numero é R$ $saldo")
        } else {
            println("Saldo insuficiente!")
        }
    }
}