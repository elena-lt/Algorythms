package arrays

/**
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 *
 * Implement the NeighborSum class:
 * - NeighborSum(int [][]grid) initializes the object.
 * - int adjacentSum(int value) returns the sum of elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom of value in grid.
 * - int diagonalSum(int value) returns the sum of elements which are diagonal neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of value in grid.
 *
 * Constraints:
 * 3 <= n == grid.length == grid[0].length <= 10
 * 0 <= grid[i][j] <= n2 - 1
 * All grid[i][j] are distinct.
 * value in adjacentSum and diagonalSum will be in the range [0, n2 - 1].
 * At most 2 * n2 calls will be made to adjacentSum and diagonalSum.
 *
 * Source: https://leetcode.com/problems/design-neighbor-sum-service/description/?envType=problem-list-v2&envId=array
 */
class NeighborSum(grid: Array<IntArray>) {

    private val localGrid = grid
    private val map = HashMap<Int, Pair<Int, Int>>()

    init {
        createMap()
    }

    fun adjacentSum(value: Int): Int {
        val (y, x) = map[value] ?: return -1
        val top = if (y != 0) {
            localGrid[y - 1][x]
        } else 0
        val right = if (x != localGrid.size - 1) {
            localGrid[y][x + 1]
        } else 0
        val left = if (x != 0) {
            localGrid[y][x - 1]
        } else 0
        val bottom = if (y != localGrid.size - 1) {
            localGrid[y + 1][x]
        } else 0
        return top + right + left + bottom
    }

    fun diagonalSum(value: Int): Int {
        val (y, x) = map[value] ?: return -1
        val topLeft = if (y > 0 && x > 0) {
            localGrid[y - 1][x - 1]
        } else 0
        val rightTop = if (y > 0 && x < localGrid.size - 1) {
            localGrid[y - 1][x + 1]
        } else 0
        val leftBottom = if (y < localGrid.size - 1 && x > 0) {
            localGrid[y + 1][x - 1]
        } else 0
        val rightBottom = if (y < localGrid.size - 1 && x < localGrid.size - 1) {
            localGrid[y + 1][x + 1]
        } else 0
        return topLeft + rightTop + leftBottom + rightBottom
    }

    private fun createMap() {
        for (i in localGrid.indices) {
            for (n in localGrid[i].indices) {
                map[localGrid[i][n]] = i to n
            }
        }
    }
}

fun main() {
    val grid = arrayOf(
        intArrayOf(0, 1, 2),
        intArrayOf(3, 4, 5),
        intArrayOf(6, 7, 8),
    )
    val sum = NeighborSum(grid)
    println(sum.diagonalSum(8))
}