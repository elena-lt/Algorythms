package strings

/**
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * Given a balanced string s, split it into some number of substrings such that:
 * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain.
 *
 * Example: Input: s = "RLRRLLRLRL". Output: 4
 *
 * Constraints:
 * 2 <= s.length <= 1000
 * s[i] is either 'L' or 'R'.
 * s is a balanced string.
 *
 * Source: https://leetcode.com/problems/split-a-string-in-balanced-strings/description/?envType=problem-list-v2&envId=string
 */
fun balancedStringSplit(s: String): Int {
    var count = 0

    var ind = 0
    var rCount = 0
    var lCount = 0

    while (ind < s.length) {
        if (s[ind] == 'L') lCount++ else rCount++

        if (lCount == rCount) {
            count++
            lCount = 0
            rCount = 0
        }
        ind++
    }

    return count
}