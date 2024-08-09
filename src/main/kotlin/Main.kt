fun main() {
    val likes = 42 // Измените значение для проверки

    val output = if (likes % 10 == 1 && likes % 100 != 11) {
        "Понравилось $likes человеку"
    } else {
        "Понравилось $likes людям"
    }

    println(output)
}
