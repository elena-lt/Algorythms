package arrays

/**
 * There are n mountains in a row, and each mountain has a height.
 * You are given an integer array height where height[i] represents the height of mountain i, and an integer threshold.
 *
 * A mountain is called stable if the mountain just before it (if it exists) has a height strictly greater than threshold.
 * Note that mountain 0 is not stable.
 *
 * Return an array containing the indices of all stable mountains in any order.
 *
 * Constraints:
 * 2 <= n == height.length <= 100
 * 1 <= height[i] <= 100
 * 1 <= threshold <= 100
 *
 * Source: https://leetcode.com/problems/find-indices-of-stable-mountains/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(n)
fun stableMountains(height: IntArray, threshold: Int): List<Int> {
    val res = mutableListOf<Int>()
    for (i in 1 until height.size) {
        if (height[i - 1] > threshold) res.add(i)
    }
    return res
}