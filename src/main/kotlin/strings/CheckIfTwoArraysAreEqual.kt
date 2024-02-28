package strings

/**
 * Given two string arrays word1 and word2,
 * return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 * Example:
 * input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Result: true
 *
 * Source: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
 */
fun main() {
    val result1 = arrayStringsAreEqual(word1 = arrayOf("ab", "c"), arrayOf("a", "bc"))
    println(result1)
}

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    return word1.reduce { acc, s -> acc + s } == word2.reduce { acc, s -> acc + s }
}