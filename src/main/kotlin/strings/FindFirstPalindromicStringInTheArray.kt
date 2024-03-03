package strings

/**
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 *
 * A string is palindromic if it reads the same forward and backward.
 *
 * Example:
 * words = ["abc","car","ada","racecar","cool"]. Result: "ada"
 * Source: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
 */
fun main() {
    val result = firstPalindrome(arrayOf("abc", "car", "ada", "racecar", "cool"))
    println(result)
}

fun firstPalindrome(words: Array<String>): String {
    words.forEach { word ->
        if (word == word.reversed()) return word
    }
    return ""
}