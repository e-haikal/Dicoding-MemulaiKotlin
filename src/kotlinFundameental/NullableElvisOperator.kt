package kotlinFundameental

fun main() {
    val name: String? = null
    println("${name?.length ?: 10}")
}