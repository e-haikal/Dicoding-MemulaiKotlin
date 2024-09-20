package kotlinFundameental
//default arguments, where you can set a default value to arguments

fun winner(first: String = "You", second: String = "Are", third: String = "Win"): String {
    return "Hooray.. $first $second $third"
}

fun main() {
//    val winnerPrompt = winner()
//    println(winnerPrompt)

//    we can replace the spesific default value
    val winnerPrompt = winner(first = "Haikal")
    println(winnerPrompt)
}
