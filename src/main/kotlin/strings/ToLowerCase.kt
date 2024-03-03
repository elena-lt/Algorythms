package strings

/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 *
 * Source: https://leetcode.com/problems/to-lower-case/description/
 */
fun main() {
val result = toLowerCase("LOVELY")
    println(result)
}

fun toLowerCase(s: String): String {
    return s.lowercase()
}

