package strings

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 *
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 *
 *  * Source:
 *  * https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=string&difficulty=EASY
 */
fun main() {
    val input = arrayOf(arrayOf("flower", "flow", "flight"))

    input.forEach { println(longestCommonPrefix(it)) }
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.any { it.isEmpty() }) return ""

    for (i in strs[0].indices) {
        val char = strs[0][i]

        for (str in strs) {
            if (i == str.length || str[i] != char) {
                return strs[0].substring(0, i)
            }
        }
    }

    return strs[0]
}