package strings

/**
 * The letter value of a letter is its position in the alphabet starting from 0
 * (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
 * The numerical value of some string of lowercase English letters s is the concatenation
 * of the letter values of each letter in s, which is then converted into an integer.
 * For example, if s = "acb", we concatenate each letter's letter value, resulting in "021".
 * After converting it, we get 21.
 *
 * You are given three strings firstWord, secondWord, and targetWord,
 * each consisting of lowercase English letters 'a' through 'j' inclusive.
 *
 * Return true if the summation of the numerical values of firstWord and secondWord equals
 * the numerical value of targetWord, or false otherwise.
 *
 * Example:
 * firstWord = "acb", secondWord = "cba", targetWord = "cdb" -> Output: true
 *
 * Source: https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/description/
 */
fun main() {
    val inputs = arrayOf(
        arrayOf("acb", "cba", "cdb"), //true
        arrayOf("aaa", "a", "aab"), //false
        arrayOf("aaa", "a", "aaaa"), //true
    )
    inputs.forEach {
        println(isSumEqual(it[0], it[1], it[2]))
    }
}

fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
    return getNumericValue(firstWord) + getNumericValue(secondWord) == getNumericValue(targetWord)
}

private fun getNumericValue(word: String): Int {
    return buildString {
        word.forEach { char -> append(char - 'a') }
    }.toInt()
}