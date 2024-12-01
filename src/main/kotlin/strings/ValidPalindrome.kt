package strings

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 *
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Constraints:
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 *
 * Source: https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=string&difficulty=EASY
 */
fun main() {
    val input = arrayOf(
//        "A man, a plan, a canal: Panama", //true
//        "race a car", //false
        "a", //true
        "0P", //false
    )
    input.forEach { println(isPalindrome(it)) }
}

fun isPalindrome(s: String): Boolean {
    val str = mutableListOf<Char>()

    s.forEach {
        if (it.isLetter() || it.isDigit()) {
            str.add(it.lowercaseChar())
        }
    }

    println("${str.size}")

    if (str.isEmpty() || str.size == 1) return true

    for (i in 0..str.size / 2) {
        if (str[i] == str[(str.size - 1) - i]) continue
        else return false

    }
    return true
}