import java.util.Scanner

class MoneyTransfers {

    private var amount = 0
    private val taxRate = 0.35
    private val minTax = 35
    private val scanner: Scanner

    public constructor(scanner: Scanner) {
        this.scanner = scanner
    }

    fun start() {
        while (true) {
            println("""
                Выберите действие:
                1. Ввести сумму перевода.
                0. Выйти
            """.trimIndent())
            val input = scanner.nextLine()
            if (input == "0") {
                break
            } else {
                setAmount()
                calculateTax()
            }
        }
    }

    private fun setAmount() {
        val newAmount = scanner.nextLine().toInt()
        this.amount = newAmount
    }

    private fun calculateTax() {
        val percentage = (amount.toDouble() * taxRate).toInt()
        val tax = if (percentage.toInt() > minTax) { percentage.toInt() } else { minTax }
        println(""""
            |сумма перевода: $amount
            |Комиссия за перевод: $tax
        """.trimMargin())
    }
}