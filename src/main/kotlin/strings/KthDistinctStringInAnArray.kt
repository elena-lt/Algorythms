package strings

/**
 * A distinct string is a string that is present only once in an array.
 * Given an array of strings 'arr', and an integer 'k', return the k[th] distinct string present in arr.
 * If there are fewer than k distinct strings, return an empty string "".
 * Note that the strings are considered in the order in which they appear in the array.
 *
 * Example:
 * Input: arr = ["d","b","c","b","c","a"], k = 2 -> Output: "a"
 * Explanation:
 * The only distinct strings in arr are "d" and "a".
 * "d" appears 1st, so it is the 1st distinct string.
 * "a" appears 2nd, so it is the 2nd distinct string.
 * Since k == 2, "a" is returned.
 *
 * Constraints:
 *
 * 1 <= k <= arr.length <= 1000
 * 1 <= arr[i].length <= 5
 * arr[i] consists of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/kth-distinct-string-in-an-array/description/
 */
fun main() {
    val inputs = arrayOf(
        arrayOf("d", "b", "c", "b", "c", "a") to 2,
        arrayOf("aaa", "aa", "a") to 1,
        arrayOf("a", "b", "a") to 3
    )
    inputs.forEach { println(kthDistinct(it.first, it.second)) }
}

fun kthDistinct(arr: Array<String>, k: Int): String {
    return arr.groupingBy { it }.eachCount()
        .filterValues { it == 1 }
        .keys
        .toList()
        .getOrElse(k - 1) { "" }
}