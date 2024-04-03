package strings

import kotlin.math.floor

/**
 * Given a string `s` and a character `letter`, return the percentage of characters in `s` that equal
 * `letter` rounded down to the nearest whole percent.
 *
 * Example: Input: s = "foobar", letter = "o" -> Output: 33
 *
 * Constraints:
 *
 * - 1 <= s.length <= 100
 * - s consists of lowercase English letters.
 * - letter is a lowercase English letter.
 *
 * Source: https://leetcode.com/problems/percentage-of-letter-in-string/description/
 */
fun main() {
    val inputs = listOf(
        "foobar" to 'o',
        "jjjj" to 'k'
    )
    inputs.forEach { println(percentageLetter(it.first, it.second)) }
}

fun percentageLetter(s: String, letter: Char): Int {
    val percentage = s.count { it == letter } / s.length.toDouble() * 100.0
    return percentage.toInt()
}
