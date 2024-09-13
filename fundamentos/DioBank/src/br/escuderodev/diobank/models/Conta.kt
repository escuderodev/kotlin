package br.escuderodev.diobank.models

open class Conta(val agencia: String, val numero: String, var saldo: Double = 0.00) {

    val movimentacao: MutableList<String> = mutableListOf()

    fun extrato() {
        println("===== Extrato Bancário =====")
        println("Ag.: ${this.agencia} | Conta: ${this.numero} | Saldo R$: ${this.saldo}")
        this.movimentacao.forEach {
            mov -> println(mov)
        }
        println("Saldo atual R$: ${this.saldo}")
    }

    open fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            movimentacao.add("- Depósito R$ $valor")
            println("Depósito no valor de R$ $valor realizado com sucesso!")
            println("Novo saldo da conta $numero é R$ $saldo")
        }
    }

    open fun saque(valor: Double) {
        if (valor >= saldo) {
            saldo -= valor
            movimentacao.add("- Saque R$ $valor")
            println("Saque no valor de R$ $valor realizado com sucesso!")
            println("Novo saldo da conta $numero é R$ $saldo")
        } else {
            println("Saldo insuficiente!")
        }
    }
}