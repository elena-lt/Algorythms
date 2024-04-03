package strings

import kotlin.math.min
import kotlin.math.tan

/**
 * There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle
 * with a pointer. A character can only be typed if the pointer is pointing to that character.
 * The pointer is initially pointing to the character 'a'.
 * Each second, you may perform one of the following operations:
 * Move the pointer one character counterclockwise or clockwise.
 * Type the character the pointer is currently on.
 *
 * Given a string word, return the minimum number of seconds to type out the characters in word.
 *
 * Example:
 * Input: word = "abc" -> Output: 5
 * Input: word = "bza" -> Output: 7,
 * Input: word = "zjpc" -> Output: 34
 *
 * Source: https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/description/
 */
fun main() {
    val inputs = listOf(
        "abc",
        "bza",
        "zjpc"
    )

    inputs.forEach { println(minTimeToType(it)) }
}

fun minTimeToType(word: String): Int {
    var result = 0
    var pos = 'a'

    word.forEach { letter ->
        val toRight = if (pos <= letter) letter - pos else letter - pos + 26
        val toLeft = if (pos >= letter) pos - letter else pos - letter + 26

        pos = letter
        result += min(toRight, toLeft) + 1 //additional second to type the letter
    }
    return result
}