fun main () {
    val likes = 21
    val lastWorldVariant1 = "людям"
    val lastWorldVariant2 = "человеку"

    val correctVariant = if (likes % 10 == 1) lastWorldVariant2 else lastWorldVariant1

    println("Нравится "+ likes + " "+ correctVariant)
}