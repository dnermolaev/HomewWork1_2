import java.lang.Math.pow

fun main () {
    val likes = 1357
    val lastWorldVariant1 = "людям"
    val lastWorldVariant2 = "человеку"

    val number = likes.toString().length-1
    val splitter = pow(10.0, number.toDouble()).toInt()
    val residue = (likes % splitter).toString().last()

    val correctVariant = if (residue == '1') lastWorldVariant2 else lastWorldVariant1

    println("Нравится "+ likes + " "+ correctVariant)
}