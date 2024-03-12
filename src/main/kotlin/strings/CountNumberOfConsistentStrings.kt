package strings

import java.util.random.RandomGeneratorFactory.all

/**
 * You are given a string {allowed} consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 *
 * Example: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Result: 2
 *
 * Source: https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 */
fun main() {
    val result1 = countConsistentStrings("ab", arrayOf("ad", "bd", "aaab", "baa", "badab"))
    val result2 = countConsistentStrings("abc", arrayOf("a", "b", "c", "ab", "ac", "bc", "abc"))
    println(result1)
}

fun countConsistentStrings(allowed: String, words: Array<String>): Int {
    val allowedAsArray = allowed.toCharArray()
    return words.count { it.toCharArray().all { char -> char in allowedAsArray } }
}