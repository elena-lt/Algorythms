package strings

/**
 * You are given an array of strings words and a string pref.
 * Return the number of strings in words that contain pref as a prefix.
 * A prefix of a string s is any leading contiguous substring of s.
 *
 * Example:
 * Input: words = ["pay","attention","practice","attend"], pref = "at"
 * Output: 2
 *
 * Source: https://leetcode.com/problems/counting-words-with-a-given-prefix/description/
 */
fun main() {
    val inputs = listOf(
        arrayOf("pay","attention","practice","attend") to "at",
        arrayOf("leetcode","win","loops","success") to "code"
    )
    inputs.forEach { println(prefixCount(it.first, it.second)) }
}

fun prefixCount(words: Array<String>, pref: String): Int {
    return words.count { it.take(pref.length) == pref }
}