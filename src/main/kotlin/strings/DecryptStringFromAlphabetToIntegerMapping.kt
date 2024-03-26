package strings

import java.lang.StringBuilder

/**
 * You are given a string `s` formed by digits and '#'.
 * We want to map s to English lowercase characters as follows:
 *
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 * Return the string formed after mapping.
 *
 * The test cases are generated so that a unique mapping will always exist.
 *
 * Example:
 * Input "10#11#12", output - "jkab"
 */
fun main() {
    println(freqAlphabets("10#11#12"))
}

fun freqAlphabets(s: String): String {
    val alphabet = ('a'..'z').toList()

    val map: Map<Int, Char> = alphabet.indices
        .associate { index -> index + 1 to alphabet[index] }

    var ind = 0
    val result = StringBuilder()

    while (ind < s.length) {
        if (s[ind].isDigit() && s.getOrNull(ind + 2) == '#') {
            val key = s.substring(ind, ind + 2).toInt()
            result.append(map[key].toString())
            ind += 3
        } else {
            result.append(map[s[ind].toString().toInt()])
            ind++
        }
    }

    return result.toString()
}