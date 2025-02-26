package arrays

/**
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 * Example: Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]. Output: [15]
 *
 * Constraints:
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 105.
 * All elements in the matrix are distinct.
 *
 * Source: https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/?envType=problem-list-v2&envId=array
 */
fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
    val answer = mutableListOf<Int>()
    for (r in 0 until matrix.size) {

        var minRowY = 0
        for (c in 0 until matrix[r].size) {
            if (matrix[r][c] < matrix[r][minRowY]) {
                minRowY = c
            }
        }

        var maxColInd = 0 to minRowY
        for (n in 0 until matrix.size) {
            if (matrix[n][minRowY] > matrix[maxColInd.first][maxColInd.second]) {
                maxColInd = n to maxColInd.second
            }
        }

        if (r to minRowY == maxColInd) {
            answer.add(matrix[r][maxColInd.second])
        }
    }
    return answer
}