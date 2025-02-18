package arrays

/**
 * You are given an array of strings words and a string pref.
 * Return the number of strings in words that contain pref as a prefix.
 * A prefix of a string s is any leading contiguous substring of s.
 *
 * Example: Input: words = ["pay","attention","practice","attend"], pref = "at". Output: 2
 *
 * Constraints:
 * 1 <= words.length <= 100
 * 1 <= words[i].length, pref.length <= 100
 * words[i] and pref consist of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/counting-words-with-a-given-prefix/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(nm), where n = words.size, m= prefix.legnth
fun prefixCount(words: Array<String>, pref: String): Int {
    var count = 0

    for (i in 0 until words.size) {
        var hasPref = false
        for (n in 0 until pref.length) {
            if (words[i].length < pref.length) break
            hasPref = pref[n] == words[i][n]
            if (!hasPref) break
        }
        if (hasPref) count++
    }

    return count
}

fun main() {
    println(prefixCount(arrayOf("i", "p"), "ikwjoty"))
}