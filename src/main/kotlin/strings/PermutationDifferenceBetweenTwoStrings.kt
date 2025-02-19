package strings

import kotlin.math.abs

/**
 * You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.
 * The permutation difference between s and t is defined as the sum of the absolute difference between
 * the index of the occurrence of each character in s and the index of the occurrence of the same character in t.
 * Return the permutation difference between s and t.
 *
 * Example: nput: s = "abc", t = "bac". Output: 2
 *
 * Constraints:
 * 1 <= s.length <= 26
 * Each character occurs at most once in s.
 * t is a permutation of s.
 * s consists only of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/permutation-difference-between-two-strings/?envType=problem-list-v2&envId=hash-table
 */
fun findPermutationDifference(s: String, t: String): Int {
    var count = 0
    for (i in s.indices) {
        val ind = t.indexOf(s[i])
        count += abs(i - ind)
    }
    return count
}

fun main() {
    println(findPermutationDifference("abc", "bac"))
}