package strings

/**
 * Your laptop keyboard is faulty, and whenever you type a character 'i' on it,
 * it reverses the string that you have written. Typing other characters works as expected.
 * You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
 *
 * Return the final string that will be present on your laptop screen.
 *
 * Example:
 * Input: s = "string"
 * Output: "rtsng"
 *
 * Example:
 * Input: s = "poiinter"
 * Output: "ponter"
 *
 * Source: https://leetcode.com/problems/faulty-keyboard/
 */
fun main() {
    val inputs = listOf("string", "poiinter")
    inputs.forEach { println(finalString(it)) }
}

fun finalString(s: String): String {
    val reverseChar = 'i'

    return s.toList()
        .map { it.toString() }
        .reduce { acc, c ->
            if (c == reverseChar.toString()) acc.reversed() else acc + c
        }
}

fun finalStringV2(s: String): String {
    return buildString {
        s.forEach { char -> if (char == 'i') reverse() else append(char) }
    }
}