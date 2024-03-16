package strings

/**
 * You are given a 0-indexed string s typed by a user. Changing a key is defined as using
 * a key different from the last used key.
 * For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
 * Return the number of times the user had to change the key.
 *
 * Note: Modifiers like shift or caps lock won't be counted in changing the key that is if
 * a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.
 *
 * Example:
 * Input: s = "aAbBcC" -> Output: 2
 * Input: s = "AaAaAaaA" -> Output: 0
 *
 * Source: https://leetcode.com/problems/number-of-changing-keys/description/
 */
fun main() {
    val input = listOf(
        "aAbBcC",
        "AaAaAaaA",
        "mDVD",
        "AaAaAaaA"
    )

    input.forEach { println(countKeyChanges(it)) }
}

fun countKeyChanges(s: String): Int {
    var changes = 0
    s.forEachIndexed { index, c ->
        if (index > 0 && c.lowercase() != s[index - 1].lowercase()) {
            changes++
        }
    }
    return changes
}