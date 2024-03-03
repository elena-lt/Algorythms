package strings

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 *
 * Example:
 *  Inout: s = "Let's take LeetCode contest"
 *  Result: "s'teL ekat edoCteeL tsetnoc"
 *
 * Constraints:
 * - 1 <= s.length <= 5 * 104
 * - s contains printable ASCII characters.
 * - s does not contain any leading or trailing spaces.
 * - There is at least one word in s.
 * - All the words in s are separated by a single space.
 *
 * Source: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 */
fun main() {
    val result = reverseWords("Let's take LeetCode contest")
    println(result)
}

fun reverseWords(s: String): String {
    return s.split(" ").joinToString(" ") { it.reversed() }
}