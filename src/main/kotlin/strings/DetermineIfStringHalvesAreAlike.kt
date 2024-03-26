package strings

/**
 * You are given a string s of even length. Split this string into two halves of equal lengths,
 * and let a be the first half and b be the second half.
 *
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 * Notice that s contains uppercase and lowercase letters.
 *
 * Return true if a and b are alike. Otherwise, return false.
 *
 * Example:
 * Input: book -> output true
 * Inout: textbook -> output false
 *
 * Source: https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
 */
fun main() {
    val inputs = listOf(
        "book",
        "textbook"
    )
    inputs.forEach(::halvesAreAlike)
}

fun halvesAreAlike(s: String): Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val a = s.substring(0, s.length / 2)
    val b = s.substring(s.length / 2)

    return a.count { it in vowels } == b.count { it in vowels }
}