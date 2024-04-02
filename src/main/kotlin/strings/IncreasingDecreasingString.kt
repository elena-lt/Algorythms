package strings

import java.lang.StringBuilder

/**
 * You are given a string s. Reorder the string using the following algorithm:
 *
 * 1. Pick the smallest character from s and append it to the result.
 * 2. Pick the smallest character from s which is greater than the last appended character to the result and append it.
 * 3. Repeat step 2 until you cannot pick more characters.
 * 4. Pick the largest character from s and append it to the result.
 * 5. Pick the largest character from s which is smaller than the last appended character to the result and append it.
 * 6. Repeat step 5 until you cannot pick more characters.
 * 7. Repeat the steps from 1 to 6 until you pick all characters from s.
 *
 * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.
 *
 * Return the result string after sorting s with this algorithm.
 *
 * Example:
 * Input: s = "aaaabbbbcccc" -> Output: "abccbaabccba"
 * Input: s = "rat" -> Output: "art"
 *
 * Constraints:
 * - s consists of only lowercase English letters.
 * - 1 <= s.length <= 500
 *
 * Source: https://leetcode.com/problems/increasing-decreasing-string/
 */
fun main() {
    val inputs = listOf(
        "aaaabbbbcccc",
        "rat"
    )

    inputs.forEach { println(sortStringV2(it)) }
}

/**
 *  Runtime complexity of O(n^2) due to the nested loop where we're iterating over the characters
 *  in the string and then removing them from the list, which has a linear time complexity.
 */
fun sortString(s: String): String {
    val sorted = s.toCharArray().toMutableList()

    val result = StringBuilder()
    var asc: Boolean = true

    while (sorted.isNotEmpty()) {
        val chars = if (asc) {
            sorted.toSortedSet()
        } else sorted.toSet().sortedDescending()

        chars.forEach {
            result.append(it)
            sorted.remove(it)
        }

        asc = !asc
    }

    return result.toString()
}

fun sortStringV2(s: String): String {
    val counts = IntArray(26)
    for (c in s) {
        counts[c - 'a']++
    }

    val result = StringBuilder()
    var remainingChars = s.length

    while (remainingChars > 0) {
        for (i in 0 until 26) {
            if (counts[i] > 0) {
                result.append('a' + i)
                counts[i]--
                remainingChars--
            }
        }

        for (i in 25 downTo 0) {
            if (counts[i] > 0) {
                result.append('a' + i)
                counts[i]--
                remainingChars--
            }
        }
    }

    return result.toString()
}