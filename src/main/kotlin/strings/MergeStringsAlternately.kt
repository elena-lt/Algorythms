package strings

/**
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * Example:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 *
 * Source: https://leetcode.com/problems/merge-strings-alternately/description/
 */
fun main() {
    val input = listOf(
        "abc" to "pqr", //apbqcr
        "ab" to "pqrs", //apbqrs
        "abcd" to "pq"
    )

    input.forEach {
        println(mergeAlternately(it.first, it.second))
    }
}

fun mergeAlternately(word1: String, word2: String): String {
    return buildString {
        word1.forEachIndexed { index, c ->
            append(word1[index])
            word2.getOrNull(index)?.let { append(it) }
            if(word1.lastIndex == index && word1.length < word2.length) append(word2.substring(word1.length))
        }
    }
}