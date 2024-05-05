import java.util.Scanner

class HumanPeople {

    private var likes = 0
    private val scanner: Scanner

    public constructor(scanner: Scanner) {
        this.scanner = scanner
    }

    public fun start() {
        while (true) {
            println(
                """
            Выберите действие:
            1. Ввести количество лайеов.
            0. Выйти
        """.trimIndent()
            )
            val input = scanner.nextLine()
            if (input == "0") {
                break
            } else {
                setLikes()
                setSuffixAndPrint()
            }
        }
    }

    private fun setLikes() {
        println("Введите количество лайков")
        val likes = scanner.nextLine().toInt()
        this.likes = likes
    }

    private fun setSuffixAndPrint() {
        val suffix = if (likes.toString().last() == '1') {"человеку"} else {"людям"}
        println("Понравилось $likes $suffix")
    }
}