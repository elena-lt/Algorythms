package strings

/**
 * You are given an array of strings 'words' and a string 'chars'.
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * Return the sum of lengths of all good strings in words.
 *
 * Input: ["cat","bt","hat","tree"], chars = "atach" -> Output: 6
 *
 * Constraints:
 * - 1 <= words.length <= 1000
 * - 1 <= words[i].length, chars.length <= 100
 * - words[i] and chars consist of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/
 */
fun main() {
    val inputs = arrayOf(
        arrayOf("cat", "bt", "hat", "tree") to "atach", //6
        arrayOf("hello", "world", "leetcode") to "welldonehoneyr", //10
    )
    inputs.forEach { println(countCharacters(it.first, it.second)) }
}

fun countCharacters(words: Array<String>, chars: String): Int {
    var sum = 0
    val letters = IntArray(26).apply {
        chars.forEach { this[it - 'a']++ }
    }

    words.forEach { word ->
        val temLetters = letters.copyOf()
        var isGood = true
        for (char in word) {
            temLetters[char - 'a']--
            if (temLetters[char - 'a'] < 0) {
                isGood = false
                break
            }
        }
        if (isGood) sum += word.length
    }
    return sum
}