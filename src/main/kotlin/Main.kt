import kotlin.random.Random

fun getRandomInt() = Random.nextInt()

fun main() {
    for (i in 0..4) {
        // создаём случайное число
        val random = getRandomInt()
        // является ли число чётным
        val isEven = random.rem(2) == 1

        when(isEven) {
            true -> println("$random is even")
            false -> println("$random is odd")
        }
    }

}
