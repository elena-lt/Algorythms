package arrays

/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements
 * on the secondary diagonal that are not part of the primary diagonal.
 *
 * Example: Input: mat = [[1,2,3],
 *                       [4,5,6],
 *                       [7,8,9]]
 *              Output: 25
 *
 * Constraints:
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 *
 * Source: https://leetcode.com/problems/matrix-diagonal-sum/description/?envType=problem-list-v2&envId=array
 */
fun diagonalSum(mat: Array<IntArray>): Int {
    var primarySum = 0
    var secondarySum = 0

    if (mat.size == 1) return mat[0][0]

    for (i in 0 until mat.size) {
        if (i == 0) {
            primarySum += mat[i][i]
            secondarySum += mat[i][mat.size - 1]
        } else {
            primarySum += mat[i][i]
            if (i to i != i to mat.size - 1 - i) {
                secondarySum += mat[i][mat.size - 1 - i]
            }
        }
    }
    return primarySum + secondarySum
}