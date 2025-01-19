package arrays

/**
 * You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
 *
 * Return the minimum number of operations to make all elements of nums divisible by 3.
 *
 * Example:
 * Input: nums = [1,2,3,4], Output: 3
 * Input: nums = [3,6,9], Output: 0
 *
 * Constraints:
 * 1 <= nums.length <= 50
 * 1 <= nums[i] <= 50
 *
 * Source: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val input = listOf(
        intArrayOf(1, 2, 3, 4), //3
        intArrayOf(3, 6, 9), //0
    )
    input.forEach { println(dividable(it)) }
}

private fun dividable(nums: IntArray): Int {
    var count = 0
    nums.forEach { num ->
        when (num.mod(3)) {
            1, 2 -> count += 1
            else -> Unit
        }
    }
    return count
}