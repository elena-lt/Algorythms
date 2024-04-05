package strings

/**
 * Given an integer n, return a string array 'answer' (1-indexed) where:
 *
 * - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * - answer[i] == "Fizz" if i is divisible by 3.
 * - answer[i] == "Buzz" if i is divisible by 5.
 * - answer[i] == 'i' (as a string) if none of the above conditions are true.
 *
 * Example: Input: n = 3 -> Output: ["1","2","Fizz"]
 */
fun main() {
    val inputs = listOf(
        3, //["1","2","Fizz"]
        5, //["1","2","Fizz","4","Buzz"]
        15, //["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    )
    inputs.forEach { println(fizzBuzz(it)) }
}

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (ind in 0 until n) {
        result.add(ind, getAnswer(ind + 1))
    }
    return result
}

private fun getAnswer(value: Int): String {
    return when {
        value.mod(3) == 0 && value.mod(5) == 0 -> "FizzBuzz"
        value.mod(3) == 0 -> "Fizz"
        value.mod(5) == 0 -> "Buzz"
        else -> value.toString()
    }
}
