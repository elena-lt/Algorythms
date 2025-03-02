package arrays

/**
 * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2].
 * Each integer appears exactly once except a which appears twice and b which is missing.
 * The task is to find the repeating and missing numbers a and b.
 *
 * Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
 */
fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
    val freq = HashMap<Int, Int>(grid.size * grid.size)

    for (i in grid.indices) {
        for (n in grid[i].indices) {
            freq[grid[i][n]] = freq.getOrDefault(grid[i][n], 0) + 1
        }
    }

    val res = IntArray(2)
    for (i in 1 until grid.size * grid.size + 1) {
        if (freq[i] == null) {
            res[1] = i
        } else if (freq[i] == 2) {
            res[0] = i
        }
    }
    return res
}