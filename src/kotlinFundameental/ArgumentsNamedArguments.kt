package kotlinFundameental
//this is an exercise to implement namedArguments
//we can give a name to arguments, so we could just remember the name, not the position of the parameter.

fun getFullName(first: String, middle: String, last: String): String {
     return "Hello $first $middle $last"
}
fun main() {
    val sayHello = getFullName(first = "Asman", middle = "Haikal", last = "Alhafidz")
    println(sayHello)
}