package kotlinFundameental

fun main() {
    var obj: Any = "Haikal"
    if (obj is String) {
        println("String length is ${obj.length}")
    }

//    Output: String length is 6

}