package arrays

/**
 * You are given a 0-indexed integer array nums. In one operation, you may do the following:
 *
 * Choose two integers in nums that are equal.
 * Remove both integers from nums, forming a pair.
 * The operation is done on nums as many times as possible.
 *
 * Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that
 * are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
 *
 * Example: Input: nums = [1,3,2,1,3,2,2]. Output: [3,1]
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 *
 * Source: https://leetcode.com/problems/maximum-number-of-pairs-in-array/?envType=problem-list-v2&envId=array
 */
fun numberOfPairs(nums: IntArray): IntArray {
    val ans = IntArray(2)
    val freq = HashMap<Int, Int>()
    for (num in nums) {
        freq[num] = (freq[num] ?: 0) + 1
    }

    for ((_, count) in freq) {
        if (count % 2 == 0) {
            ans[0] = ans[0] + (count / 2)
        } else {
            if (count > 1) {
                ans[0] = ans[0] + (count / 2)
            }
            ans[1] = ans[1] + 1
        }
    }
    return ans
}