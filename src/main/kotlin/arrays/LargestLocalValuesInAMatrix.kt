package arrays

import kotlin.math.max

/**
 * You are given an n x n integer matrix grid.
 *
 * Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
 *
 * maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
 * In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
 *
 * Return the generated matrix.
 *
 * Example:
 * Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]. Output: [[9,9],[8,6]]
 *
 * Constraints:
 * n == grid.length == grid[i].length
 * 3 <= n <= 100
 * 1 <= grid[i][j] <= 100
 *
 * Source: https://leetcode.com/problems/largest-local-values-in-a-matrix/description/?envType=problem-list-v2&envId=array
 */
//Time Complexity: O(n^2)
fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
    val res = Array(grid.size - 2) { IntArray(grid.size - 2) }

    for (col in 0 until grid.size - 2) {
        for (row in 0 until grid.size - 2) {
            val max = maxOf(
                maxOf(grid[row][col], grid[row][col + 1], grid[row][col + 2]),
                maxOf(grid[row + 1][col], grid[row + 1][col + 1], grid[row + 1][col + 2]),
                maxOf(grid[row + 2][col], grid[row + 2][col + 1], grid[row + 2][col + 2])
            )

            res[row][col] = max
        }
    }
    return res
}
