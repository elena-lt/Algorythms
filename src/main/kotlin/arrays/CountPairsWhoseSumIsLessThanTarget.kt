package arrays

/**
 * Given a 0-indexed integer array nums of length n and an integer target,
 * return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 *
 * Constraints:
 * 1 <= nums.length == n <= 50
 * -50 <= nums[i], target <= 50
 *
 * Example: Input: nums = [-1,1,2,3,1], target = 2. Output: 3 ((0, 1), (0, 2), (0, 4))
 *
 * Source: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(n^2)
fun countPairs(nums: List<Int>, target: Int): Int {
    var res = 0

    for (i in 0 until nums.size - 1) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] < target) res++
        }
    }
    return res
}