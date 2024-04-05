package strings


/**
 * A string is good if there are no repeated characters.
 * Given a string 's', return the number of good substrings of length three in 's'.
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 * A substring is a contiguous sequence of characters in a string.
 *
 * Example:
 * Input: s = "xyzzaz" -> Output: 1 //There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
 *
 * Constraints:
 * - 1 <= s.length <= 100
 * - 's' consists of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
 */
fun main() {
    val inputs = listOf(
        "xyzzaz", //1
        "aababcabc", //4, "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
        "x"
    )
    inputs.forEach { println(countGoodSubstringsV2(it)) }
}

fun countGoodSubstrings(s: String): Int {
    var count = 0
    if (s.length >= 3) {
        for (i in 0..s.length - 3) {
            val value = s.substring(i, i + 3)
            if (value.toSet().size == value.length) count++
        }
    }
    return count
}

fun countGoodSubstringsV2(s: String): Int {
    var count = 0
    if (s.length >= 3) {
        for (i in 0..s.length - 3) {
            val value = s.substring(i, i + 3)

            val letters = IntArray(26) { 0 }
            for (ind in 0 until 3) {
                letters[value[ind] - 'a']++
            }
            if (letters.all { it <= 1 }) count++
        }
    }
    return count
}