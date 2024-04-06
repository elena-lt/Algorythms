package strings

/**
 * Given a string s consisting of only the characters 'a' and 'b',
 * return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
 *
 * Example: Input: s = ""aaabbb"" -> Output: true
 */
fun main() {
    val inputs = listOf(
        "aaabbb", //true
        "abab", //false
        "bbb", //true
        "a", //true
    )
    inputs.forEach { println(checkString(it)) }
}

fun checkString(s: String): Boolean {
    return s.substringAfter('b', "").none { it == 'a' }
}

fun checkStringV2(s: String): Boolean {
    var result = true
    var bAppeared = false
    for (char in s) {
        if (char == 'b') {
            bAppeared = true
        } else {
            if (bAppeared && char == 'a') {
                result = false
                break
            }
        }
    }
    return result
}