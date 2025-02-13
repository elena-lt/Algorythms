package arrays

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * Each of the words consists of only uppercase and lowercase English letters (no punctuation).
 * For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
 * You are given a sentence s and an integer k. You want to truncate s such that it contains
 * only the first k words. Return a after truncating it.
 *
 * Constraints:
 * 1 <= s.length <= 500
 * k is in the range [1, the number of words in s].
 * s consist of only lowercase and uppercase English letters and spaces.
 * The words in s are separated by a single space.
 * There are no leading or trailing spaces.
 *
 * Source: https://leetcode.com/problems/truncate-sentence/description/?envType=problem-list-v2&envId=array
 */
fun truncateSentence(s: String, k: Int): String {
    var res = ""
    var words = 0
    for (i in 0 until s.length) {
        if (s[i] == ' ') {
            words++
        }

        if (words == k) break

        if (words < k) {
            res += s[i]
        }
    }
    return res
}

fun main() {
    val s = "Hello how are you Contestant"
    println(truncateSentence(s, 4))
}