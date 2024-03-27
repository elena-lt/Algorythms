package strings

import kotlin.random.Random

/**
 * Given an integer n, return a string with n characters such that each character
 * in such string occurs an odd number of times.
 * The returned string must contain only lowercase English letters.
 * If there are multiples valid strings, return any of them.
 *
 * Example:
 * Input: n = 4 ->  "pppz", "ohhh" and "love"
 *
 * Source: https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/description/
 */
fun main() {
    println(generateTheString(4))
}

fun generateTheString(n: Int): String {
    val letters = ('a'..'z').toList()

    return buildString {
        val randomLetter = Random.nextInt(1, letters.size)

        if (n.mod(2) == 0) {
            repeat(n - 1) { append(letters[randomLetter]) }
            append(letters[0])
        } else {
            repeat(n) {
                append(letters[randomLetter])
            }
        }
    }
}