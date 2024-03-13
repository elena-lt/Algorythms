package strings

/**
 * Given an array of strings words and a string s, determine if s is an acronym of words.
 *
 * The string s is considered an acronym of words if it can be formed by concatenating
 * the first character of each string in words in order.
 * For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
 *
 * Return true if s is an acronym of words, and false otherwise.
 *
 * Source: https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
 */
fun main() {
    val collection = arrayOf(
        listOf("alice", "bob", "charlie") to "abc",
        listOf("bear", "aardvark") to "abb",
        listOf("an", "apple") to "a"
    )

    collection.forEach { words ->
        println(isAcronym(words.first, words.second))
    }
}

fun isAcronym(words: List<String>, s: String): Boolean {
    return words.map { it.first() }.joinToString("") == s
}