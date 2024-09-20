package kotlinFundameental

//var args exercise
fun sumNumber(vararg listNumber: Int): Int {
    return listNumber.sum()
}

fun main() {
    val sum = sumNumber(10, 20, 30, 40, 50)
    print(sum)
}

//If there's multiple params, only one varArgs is allowed on function. And should be placed on the end.
//if varArgs placed on the first, we can it directly.
