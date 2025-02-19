package arrays

/**
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 *
 * A string is palindromic if it reads the same forward and backward.
 *
 * Example: Input: words = ["abc","car","ada","racecar","cool"]. Output: "ada"
 *
 * Constraints:
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists only of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=problem-list-v2&envId=array
 */
fun firstPalindrome(words: Array<String>): String {
    for (word in words) {
        if (word.length == 1) return word

        var left = 0
        var right = word.length - 1
        var pal = true
        while (left < right) {

            if (word[left] != word[right]) {
                pal = false
                break
            }
            left++
            right--
        }
        if (pal) return word
    }
    return ""
}

fun main() {
    println(firstPalindrome(arrayOf("abc", "car", "ada", "racecar", "cool")))
}