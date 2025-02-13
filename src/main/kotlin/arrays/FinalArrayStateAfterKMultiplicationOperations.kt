package arrays

/**
 * You are given an integer array nums, an integer k, and an integer multiplier.
 * You need to perform k operations on nums. In each operation:
 *
 * Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
 * Replace the selected minimum value x with x * multiplier.
 * Return an integer array denoting the final state of nums after performing all k operations.
 *
 * Example: Input: nums = [2,1,3,5,6], k = 5, multiplier = 2. Output: [8,4,6,5,6]
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * 1 <= k <= 10
 * 1 <= multiplier <= 5
 *
 * Source: https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(nk) (n = size of the nums, k = k).
fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
    for (i in 0 until k) { //o(k)
        var minNum = nums[0]
        var minInd = 0
        for (m in 0 until nums.size) {
            if (nums[m] == 1) {
                minInd = m
                minNum = nums[m]
                break
            }
            if (nums[m] < minNum) {
                minNum = nums[m]
                minInd = m
            }
        }
        nums[minInd] = minNum * multiplier
        println(nums.toList())
    }
    return nums
}

fun main() {
//    val res = getFinalState(intArrayOf(2, 1, 3, 5, 6), k = 5, multiplier = 2)
    val res = getFinalState(intArrayOf(1, 2), k = 3, multiplier = 4)
    println(res.toList())
}