package functionalProgramming

// Tail recursive function to calculate factorial
tailrec fun tailRecursiveFactorial(n: Int, accumulator: Int = 1): Int {
    // Base case: if n is 0, return the accumulated value
    if (n == 0) {
        return accumulator
    }
    // Recursive case: reduce n and multiply it to the accumulator
    return tailRecursiveFactorial(n - 1, n * accumulator)
}

fun main() {
    val number = 5
    // Call the tail recursive factorial function and print the result
    println("Tail recursive factorial of $number is: ${tailRecursiveFactorial(number)}") // Output: 120

    // This will not cause a StackOverflowError, even for large numbers
    println("Tail recursive factorial of 10000 is: ${tailRecursiveFactorial(10000)}") // Works fine
}