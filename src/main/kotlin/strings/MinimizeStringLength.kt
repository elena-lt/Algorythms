package strings

/**
 * Given a 0-indexed string s, repeatedly perform the following operation any number of times:
 *
 * - Choose an index `i` in the string, and let `c` be the character in position i.
 * Delete the closest occurrence of c to the left of i (if any) and the closest occurrence
 * of `c` to the right of `i` (if any).
 *
 * Your task is to minimize the length of s by performing the above operation any number of times.
 * Return an integer denoting the length of the minimized string.
 *
 * Example:
 * Input: s = "aaabc" -> Output: 3
 * Input: s = "cbbd" -> Output: 3
 * Input: s = "dddaaa" -> Output: 2
 *
 * Source: https://leetcode.com/problems/minimize-string-length/description/
 */
fun main() {
    val inputs = listOf(
        "aaabc",
        "cbbd",
        "dddaaa",
        "bb",
        "ipi",
        "tppt",
        "cauc"
    )
    inputs.forEach { println(minimizedStringLengthV2(it)) }
}

fun minimizedStringLength(s: String): Int {
    if(s.length == 1) return 1
    val frequencyCharArray = IntArray(26)

    for(element in s) {
        frequencyCharArray[element - 'a']++
    }

    var removingCount = 0
    for(freq in frequencyCharArray) {
        if(freq > 1) {
            removingCount += freq - 1
        }
    }

    return s.length - removingCount
}

fun minimizedStringLengthV2(s: String): Int {
    return s.toSet().count()
}