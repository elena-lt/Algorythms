package strings

import java.lang.StringBuilder

/**
 * You are given an array of n strings strs, all of the same length.
 * The strings can be arranged such that there is one on each line, making a grid.
 * For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
 *
 * abc
 * bce
 * cae
 *
 * You want to delete the columns that are not sorted lexicographically.
 * In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted,
 * while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
 * Return the number of columns that you will delete.
 *
 * Source: https://leetcode.com/problems/delete-columns-to-make-sorted/description/
 */
fun main() {
    val inputs = arrayOf(
        arrayOf("abc", "bce", "cae"), //1
        arrayOf("cba", "daf", "ghi"), //1
        arrayOf("a", "b"), //0
        arrayOf("zyx", "wvu", "tsr") //3
    )

    inputs.forEach { println(minDeletionSize(it)) }
}

fun minDeletionSize(strs: Array<String>): Int {
    var deletedCount = 0

    val rowsNum = strs.size
    val columsNum = strs[0].length

    for (col in 0 until columsNum) {
        val res = StringBuilder()
        for (row in 1 until rowsNum) {
            res.append(strs[row][col])
            if (strs[row - 1][col] > strs[row][col]) {
                deletedCount++
                break
            }
        }
    }

    return deletedCount
}