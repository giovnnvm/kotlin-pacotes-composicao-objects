package br.com.alura.bytebank.modelo

/**
 *@Author giovanni.moratto
 */

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}