package arrays

/**
 * Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones,
 * and the number of ones in that row.
 * In case there are multiple rows that have the maximum count of ones, the row with the smallest row
 * number should be selected.
 * Return an array containing the index of the row, and the number of ones in it.
 *
 * Example: Input: mat = [[0,1],[1,0]]. Output: [0,1]
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 100
 * mat[i][j] is either 0 or 1.
 *
 * Source: https://leetcode.com/problems/row-with-maximum-ones/description/?envType=problem-list-v2&envId=array
 */
fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
    var rowInd = 0
    var count = 0

    for (i in mat.indices) {
        var tempCount = 0
        for (n in mat[i].indices) {
            if (mat[i][n] == 1) {
                tempCount++
            }
        }

        if (tempCount > count) {
            count = tempCount
            rowInd = i
        }
    }

    return intArrayOf(rowInd, count)
}
