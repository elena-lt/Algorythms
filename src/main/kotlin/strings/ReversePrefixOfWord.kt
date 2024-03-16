package strings

/**
 * Given a 0-indexed string word and a character ch,
 * reverse the segment of word that starts at index 0 and ends at the index
 * of the first occurrence of ch (inclusive).
 * If the character ch does not exist in word, do nothing.
 *
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment
 * that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 *
 * Return the resulting string.
 *
 * Constraints:
 *
 * - 1 <= word.length <= 250
 * - word consists of lowercase English letters.
 * - ch is a lowercase English letter.
 *
 * Source: https://leetcode.com/problems/reverse-prefix-of-word/description/
 */
fun main() {
    val inputs = listOf(
        "abcdefd" to 'd',
        "xyxzxe" to 'z',
        "abcd" to 'z',
    )
    inputs.forEach { (word, ch) -> println(reversePrefix(word, ch)) }
}

fun reversePrefix(word: String, ch: Char): String {
    if (word.isEmpty()) return ""

    return buildString {
        for (i in word.indices) {
            if (word[i] == ch) {
                append(word[i]).reverse()
                append(word.substring(i + 1))
                return@buildString
            }else{
                append(word[i])
            }
        }
    }
}