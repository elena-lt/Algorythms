package strings

import kotlin.math.abs

/**
 * You are given a string s. The score of a string is defined as the sum of the absolute
 * difference between the ASCII values of adjacent characters. Return the score of s.
 *
 * Example: Input: s = "hello". Output: 13
 *
 * Constraints:
 * 2 <= s.length <= 100
 * s consists only of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/score-of-a-string/description/?envType=problem-list-v2&envId=string
 */
fun scoreOfString(s: String): Int {
    var sum = 0

    for (i in 1 until s.length) {
        sum += abs(s[i - 1] - s[i])
    }
    return sum
}