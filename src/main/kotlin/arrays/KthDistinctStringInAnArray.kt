package arrays

/**
 * A distinct string is a string that is present only once in an array.
 * Given an array of strings arr, and an integer k, return the kth distinct string present in arr.
 * If there are fewer than k distinct strings, return an empty string "".
 *
 * Note that the strings are considered in the order in which they appear in the array.
 *
 * Example: Input: arr = ["d","b","c","b","c","a"], k = 2. Output: "a"
 *
 * Constraints:
 * 1 <= k <= arr.length <= 1000
 * 1 <= arr[i].length <= 5
 * arr[i] consists of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/kth-distinct-string-in-an-array/description/?envType=problem-list-v2&envId=array
 */
fun kthDistinct(arr: Array<String>, k: Int): String {
    if (arr.size < k) return ""
    val freq = mutableMapOf<String, Int>()
    for (word in arr) {
        freq[word] = freq.getOrDefault(word, 0) + 1
    }
    return freq.filterValues { it == 1 }.keys.toList().getOrElse(k - 1, { "" })
}

fun kthDistinctV2(arr: Array<String>, k: Int): String {
    if (arr.size < k) return ""
    val freq = mutableMapOf<String, Int>()

    for (word in arr) {
        freq[word] = freq.getOrDefault(word, 0) + 1
    }

    var count = 0
    for ((word, freq) in freq) {
        if (freq == 1) count++

        if (count == k) return word
    }

    return ""
}

fun main() {
    println(kthDistinctV2(arrayOf("d", "b", "c", "b", "c", "a"), 2))
}