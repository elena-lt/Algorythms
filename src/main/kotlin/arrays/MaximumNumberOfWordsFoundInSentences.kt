package arrays

import kotlin.math.max

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 *
 * Return the maximum number of words that appear in a single sentence.
 *
 * Constraints:
 * 1 <= sentences.length <= 100
 * 1 <= sentences[i].length <= 100
 * sentences[i] consists only of lowercase English letters and ' ' only.
 * sentences[i] does not have leading or trailing spaces.
 * All the words in sentences[i] are separated by a single space.
 *
 * Source: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?envType=problem-list-v2&envId=array
 */
fun mostWordsFound(sentences: Array<String>): Int {
    var max = 0
    for (i in 0 until sentences.size) {
        max = max(max, sentences[i].count { it == ' ' } + 1)
    }
    return max
}

fun main() {
    val sent =
        arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")
    println(mostWordsFound(sent))
}