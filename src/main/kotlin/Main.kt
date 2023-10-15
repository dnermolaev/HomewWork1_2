import java.lang.Math.pow

fun main () {
    val likes = 21
    val lastWorldVariant1 = "людям"
    val lastWorldVariant2 = "человеку"


    val residue = likes.toString().last()
    val residue2 = likes.toString().takeLast(2)

    val correctVariant = if (residue == '1' && residue2 != "11") lastWorldVariant2 else lastWorldVariant1

    println("Нравится "+ likes + " "+ correctVariant)
}