package arrays

/**
 * You are given an array of n strings strs, all of the same length.
 * The strings can be arranged such that there is one on each line, making a grid.
 * For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
 * abc
 * bce
 * cae
 * You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted, while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
 *
 * Return the number of columns that you will delete.
 *
 * Example: Input: strs = ["cba","daf","ghi"]. Output: 1
 *
 * Constraints:
 * n == strs.length
 * 1 <= n <= 100
 * 1 <= strs[i].length <= 1000
 * strs[i] consists of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/delete-columns-to-make-sorted/description/?envType=problem-list-v2&envId=array
 *
 */
fun minDeletionSize(strs: Array<String>): Int {
    var count = 0
    for (i in strs[0].indices) {
        for (n in 0 until strs.size - 1) {
            if (strs[n][i] > strs[n + 1][i]) {
                count++
                break
            }
        }
    }
    return count
}