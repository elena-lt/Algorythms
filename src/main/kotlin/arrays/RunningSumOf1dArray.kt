package arrays

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 * Constraints:
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 *
 * Input: nums = [1,2,3,4]. Output:  [1, 3, 6, 10]
 *
 * Source: https://leetcode.com/problems/running-sum-of-1d-array/description/?envType=problem-list-v2&envId=array
 */
fun runningSum(nums: IntArray): IntArray {
    val res = IntArray(nums.size)
    for (i in 0 until nums.size) {
        if (i == 0) {
            res[i] = nums[i]
        } else {
            res[i] = res[i - 1] + nums[i]
        }
    }
    return res
}