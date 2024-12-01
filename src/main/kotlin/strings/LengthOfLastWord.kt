package strings

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Example:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *
 * Source: https://leetcode.com/problems/length-of-last-word/?envType=problem-list-v2&envId=string&difficulty=EASY
 *
 */
fun main() {

    val input = arrayOf(
        "Hello World",
        "   fly me   to   the moon  ", //4
        "luffy is still joyboy", //6
        " a",
    )
    input.forEach { println(lengthOfLastWordV2(it)) }
}

fun lengthOfLastWord(s: String): Int {
    return s.trim()
        .split(" ")
        .last().count()
}

fun lengthOfLastWordV2(s: String): Int {
    var res = 0
    for (i in s.indices.reversed()) {

        if (res == 0 && s[i] == ' ') {
            continue
        } else if (res >= 1 && s[i] == ' ') {
            break
        } else {
            res++
        }
    }
    return res
}
