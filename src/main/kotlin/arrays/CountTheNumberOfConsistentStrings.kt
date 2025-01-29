package arrays

/**
 * You are given a string `allowed` consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string `allowed`.
 * Return the number of consistent strings in the array words.
 *
 * Example: Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"], Output: 2
 *
 * Constraints:
 *
 * 1 <= words.length <= 104
 * 1 <= allowed.length <= 26
 * 1 <= words[i].length <= 10
 * The characters in allowed are distinct.
 * words[i] and allowed contain only lowercase English letters.
 *
 * Source: https://leetcode.com/problems/count-the-number-of-consistent-strings/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val input = listOf(
        Pair("ab", arrayOf("ad", "bd", "aaab", "baa", "badab")), //2
        Pair("abc", arrayOf("a", "b", "c", "ab", "ac", "bc", "abc")), //7
        Pair("cad", arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d")), //4
    )
    input.forEach { println(countConsistentStrings(it.first, it.second)) }
    countConsistentStrings("ab", arrayOf("bd", "aaab", "baa", "badab"))
}

/**
 * Time complexity:
 * O(k)+O(nm)
 * Since k ≤ 26 (constant upper bound), O(k) is negligible.
 * Final complexity: O(nm).
 */
private fun countConsistentStrings(allowed: String, words: Array<String>): Int {
    var letters = allowed.toSet()

    return words.count { word -> word.all { it in letters } }
}