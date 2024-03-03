package strings

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence
 * is a pangram, or false otherwise.
 *
 * Constraints:
 * - 1 <= sentence.length <= 1000
 * - sentence consists of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 */
fun main() {
    val result = checkIfPangramV2("thequickbrownfoxjumpsoverthelazydog")
    println(result)
}

fun checkIfPangram(sentence: String): Boolean {
    val alphabet = ('a'..'z').toMutableList()

    sentence.forEach { letter ->
        if (letter in alphabet) alphabet.remove(letter)
    }
    return alphabet.isEmpty()
}

fun checkIfPangramV2(sentence: String): Boolean {
    return sentence.toSet().size == 26
}