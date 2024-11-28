package arrays

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer. The digits are ordered from most
 * significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 */
fun main() {
    val inputs = listOf(
        intArrayOf(1, 2, 3),
        intArrayOf(9),
        intArrayOf(9, 9, 9),
        intArrayOf(8,9,9,9)
    )

    inputs.forEach { println(plusOne(it).toList()) }
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] in (0..8)) {
            digits[i]= digits[i] + 1
            return digits
        } else {
            digits[i] = 0
        }
    }
    return intArrayOf(1).plus(digits)
}