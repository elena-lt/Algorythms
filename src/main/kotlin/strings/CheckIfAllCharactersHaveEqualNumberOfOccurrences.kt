package strings

/**
 * Given a string s, return true if s is a good string, or false otherwise.
 *
 * A string s is good if all the characters that appear in s have the same number of occurrences
 * (i.e., the same frequency).
 *
 * Example:
 * Input: s = "abacbc", Output: true
 * Input: s = "aaabb", Output: false
 */
fun main() {
    val inputs = listOf(
        "abacbc",
        "aaabb",
        "vvvvvvvvvvvvvvvvvvv"
    )

    inputs.forEach {
        println(areOccurrencesEqualV2(it))
    }
}
fun areOccurrencesEqualV2(s: String): Boolean{
    val group = s.groupBy { it }
    return group.values.all { it.size == group.values.first().size }
}