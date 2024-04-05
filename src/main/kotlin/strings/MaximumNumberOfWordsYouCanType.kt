package strings

/**
 * There is a malfunctioning keyboard where some letter keys do not work.
 * All other keys on the keyboard work properly.
 * Given a string 'text' of words separated by a single space (no leading or trailing spaces)
 * and a string 'brokenLetters' of all distinct letter keys that are broken, return the number of
 * words in text you can fully type using this keyboard.
 *
 * Example: Input: text = "hello world", brokenLetters = "ad" -> Output: 1
 *
 * Constraints:
 *
 * - 1 <= text.length <= 104
 * - 0 <= brokenLetters.length <= 26
 * - text consists of words separated by a single space without any leading or trailing spaces.
 * - Each word only consists of lowercase English letters.
 * - brokenLetters consists of distinct lowercase English letters.
 *
 * Source: https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/
 */
fun main() {

    val inputs = listOf(
        "hello world" to "ad",
        "leet code" to "lt",
        "leet code" to "e"
    )
    inputs.forEach { println(canBeTypedWordsV2(it.first, it.second)) }
}

fun canBeTypedWords(text: String, brokenLetters: String): Int {
    val brokenLtrs = brokenLetters.toList()
    var count = 0
    text.split(" ").forEach {
        if (it.none { it in brokenLtrs }) count++
    }
    return count
}

fun canBeTypedWordsV2(text: String, brokenLetters: String): Int {
    var count = 0
    val broken = BooleanArray(26).apply {
        brokenLetters.forEach { letter ->
            this[letter - 'a'] = true
        }
    }

    text.split(" ")
        .forEach { if (it.none { broken[it - 'a'] }) count++ }

    return count
}

fun canBeTypedWordsV23(text: String, brokenLetters: String): Int {
    return text.split(" ").count { it.none { brokenLetters.contains(it) } }
}