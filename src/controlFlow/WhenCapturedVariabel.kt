package controlFlow

import kotlin.random.Random

//Since Kotlin 1.3 , we can capture the subject of a when expression in a variable. An example is as follows:

fun main() {
    val regis = getRegisterNumber()  // Declare the variable regis before the when expression
    val registerNumber = when (regis) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println("Register number: $registerNumber")
}

fun getRegisterNumber() = Random.nextInt(100)
