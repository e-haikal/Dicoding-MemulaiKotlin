package functionalProgramming

// Regular recursive function to calculate factorial
fun factorial(n: Int): Int {
    // Base case: if n is 0, return 1 (0! = 1)
    if (n == 0) {
        return 1
    }
    // Recursive case: n! = n * (n-1)!
    return n * factorial(n - 1)
}

fun main() {
    val number = 5
    // Call the factorial function and print the result
    println("Factorial of $number is: ${factorial(number)}") // Output: 120

    // Uncommenting this line with a large number may cause StackOverflowError
    // println("Factorial of 10000 is: ${factorial(10000)}")
}