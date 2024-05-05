import java.util.Scanner
import kotlin.math.ceil

class MusicLover {
    private val regularCustomerDiscount = 0.01
    private val minDiscount = 100
    private val maxDiscount = 0.05
    private var finalSum = 0

    private val scanner: Scanner

    constructor(scanner: Scanner) {
        this.scanner = scanner
    }

    fun start() {
        while (true) {
            println("""
                Выберите действие:
                1. Ввести сумму покупки
                0. Выйти
            """.trimIndent())
            val input = scanner.nextLine()
            if (input == "0") {
                break
            } else {
                calculateDiscount()
                calculateDisountForRegularCustomer()
                getFinalSum()
            }
        }
    }

    private fun calculateDiscount() {
        println("Введите сумму покупки")
        val sum = scanner.nextLine().toInt()
        finalSum = if (sum <= 1_000) {
            sum
        } else if (sum <= 10_000) {
            sum - minDiscount
        } else {
            val discount = sum.toDouble() * maxDiscount
            sum - discount.toInt()
        }
    }

    private fun calculateDisountForRegularCustomer() {
        println("""
            Покупатель является постоянным клиентом?
            1. Да
            2. Нет
        """.trimIndent())
        val customerStatus = scanner.nextLine()
        if (customerStatus == "1") {
            val discountSum = finalSum * regularCustomerDiscount
            finalSum -= discountSum.toInt()
        }
    }

    private fun getFinalSum() {
        println("Конечная цена: $finalSum")
    }

}