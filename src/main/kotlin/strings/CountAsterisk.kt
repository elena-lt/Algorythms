package strings

/**
 * You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair.
 * In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
 *
 * Return the number of '*' in s, excluding the '*' between each pair of '|'.
 *
 * Note that each '|' will belong to exactly one pair.
 *
 * Example:
 * Input: s = "l|*e*et|c**o|*de|"
 * Output: 2
 *
 * Input: s = "iamprogrammer"
 * Output: 0
 *
 * Source: https://leetcode.com/problems/count-asterisks/description/
 */
fun main() {
    val inputs = listOf("l|*e*et|c**o|*de|", "iamprogrammer")
    inputs.forEach { println(countAsterisks(it)) }
}

fun countAsterisks(s: String): Int {
    var res = 0
    var shouldConsider: Boolean = true

    s.forEach { char ->
        if (char == '|') {
            shouldConsider = !shouldConsider
        } else {
            if (char == '*' && shouldConsider) res++
        }
    }
    return res
}