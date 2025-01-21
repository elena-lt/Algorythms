package arrays

import strings.findWordsContaining

/**
 * You are given a 0-indexed array of strings words and a character x.
 * Return an array of indices representing the words that contain the character x.
 * Note that the returned array may be in any order.
 *
 * Example:
 * Input: words = ["leet","code"], x = "e", Output: [0,1]
 *
 * Constraints:
 *
 * 1 <= words.length <= 50
 * 1 <= words[i].length <= 50
 * x is a lowercase English letter.
 * words[i] consists only of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/find-words-containing-character/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val inputs = listOf(
        Pair(arrayOf("leet", "code"), 'e'), //[0,1]
        Pair(arrayOf("abc", "bcd", "aaaa", "cbc"), 'a'), //[0,2]
        Pair(arrayOf("abc", "bcd", "aaaa", "cbc"), 'z'), //[]
    )
    inputs.forEach { findWordsContaining(it.first, it.second) }
}

/**
 * O(n⋅m)
 */
fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val  res = mutableListOf<Int>()
    words.mapIndexed { index, word -> if (word.contains(x)) res.add(index) }
    return res
}