package strings

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Source: https://leetcode.com/problems/reverse-string/description/
 */
fun main() {
    val input = arrayOf(
        charArrayOf('h', 'e', 'l', 'l', 'o'),
        charArrayOf('H','a','n','n','a','h')
    )
    input.forEach { reverseString(it) }
}

fun reverseString(s: CharArray): Unit {
    println(s.reverse())
}