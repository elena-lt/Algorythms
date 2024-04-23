package strings

/**
 * Given a string of English letters s, return the greatest English letter which occurs
 * as both a lowercase and uppercase letter in 's'. The returned letter should be in uppercase.
 * If no such letter exists, return an empty string.
 * An English letter b is greater than another letter a if b appears after a in the English alphabet.
 *
 * Example:
 * Input: s = "lEeTcOdE"
 * Output: "E"
 *
 * Source: https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/description/
 */
fun main() {
    val inputs = listOf(
        "lEeTcOdE", //"E"
        "arRAzFif", //"R"
        "AbCdEfGhIjK", //""
    )
    inputs.forEach { println(greatestLetter(it) ) }
}

fun greatestLetter(s: String): String {
    var result = ""
    val letters = Array(26) { BooleanArray(2) }

    s.forEach { letter ->
        val ind = letter.lowercaseChar() - 'a'
        if (letter.isUpperCase()) letters[ind][1] = true else letters[ind][0] = true
    }

    for (ind in letters.size -1 downTo 0) {
        if(letters[ind][0] and letters[ind][1]) {
            result = ('a' + ind).uppercase()
            break
        }
    }
    return result
}
