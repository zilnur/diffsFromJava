import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val moneyTransfers = MoneyTransfers(scanner)
    val humanPeople = HumanPeople(scanner)
    val musicLover = MusicLover(scanner)

    while (true) {
        println(
            """
        Добрый день. Выберите задание для проверки:
        1. Задача №1. Денежные переводы
        2. Задача №2. Люди/Человеки
        3. Задача №3. Меломан
        0. Закончить
    """.trimIndent()
        )

        val input = scanner.nextLine()
        when (input) {
            "1" -> moneyTransfers.start()
            "2" -> humanPeople.start()
            "3" -> musicLover.start()
            "0" -> break
        }
    }
}